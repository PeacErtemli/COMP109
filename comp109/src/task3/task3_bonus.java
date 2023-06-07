package task3;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// Videosu çekilmedi.

public class task3_bonus {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----------------------------");
        System.out.println("Hello, welcome to the game!");
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Here are the rewards:");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("$10,000 if your input matches the lottery in exact order.");
        System.out.println("$3,000 if your input matches the lottery");
        System.out.println("$1,000 if one digit in your input matches a digit in the lottery");
        System.out.println();
        System.out.println("Otherwise, you only get $5.");
        System.out.println("-----------------------------");
        TimeUnit.SECONDS.sleep(2);
        game();
    }

    public static void game() throws InterruptedException {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();

        int upper_limit = 100; // excluded
        int lower_limit = 10; // included
        int auto_number = rand.nextInt(lower_limit, upper_limit);
        int auto_first_digit = auto_number / 10;
        int auto_second_digit = auto_number % 10;
        //System.out.println(auto_number + " " + auto_first_digit + " " + auto_second_digit); // BUNU COMMENT'LEMEYİ UNUTMA

        
        System.out.println("Random number generated.");
        System.out.print("Please give a two-digit number: ");
        int input_number = input.nextInt();
        int input_first_digit = input_number / 10;
        int input_second_digit = input_number % 10;
        System.out.println("-----------------------------");

        if (auto_number == input_number) {
            System.out.println("Generated number: " + auto_number);
            System.out.println("Your given number: " + input_number);
            System.out.println("Congratulations! You've won $10,000!");
            System.out.println("-----------------------------");
        } else if ((auto_first_digit == input_second_digit) && (auto_second_digit == input_first_digit)) {
            System.out.println("Generated number: " + auto_number);
            System.out.println("Your given number: " + input_number);
            System.out.println("Congratulations! You've won $3,000!");
            System.out.println("-----------------------------");
        } else if ((auto_first_digit == input_first_digit) || (auto_first_digit == input_second_digit) || (auto_second_digit == input_first_digit) || (auto_second_digit == input_second_digit)) {
            // Checks if any digit matches each other.
            System.out.println("Generated number: " + auto_number);
            System.out.println("Your given number: " + input_number);
            System.out.println("Congratulations! You've won $1,000!");
            System.out.println("-----------------------------");
        } else {
            System.out.println("Generated number: " + auto_number);
            System.out.println("Your given number: " + input_number);
            System.out.println("Congratulations! You've won $5!");
            System.out.println("-----------------------------");
        }

        TimeUnit.SECONDS.sleep(1);
        System.out.println("Type 1 for playing again.");
        System.out.println("Type 2 for see the probabilities.");
        System.out.print("Your input: ");
        int decision = input.nextInt();

        if (decision == 1) {
            System.out.println();
            System.out.println();
            game();
        } else if (decision == 2) {
            probabilites();
        } else {
            System.out.println("Not listed input, game is finished.");
            System.out.println("-----------------------------");
        }


        input.close();
    }

    public static void probabilites() throws InterruptedException {
        System.out.println("You've asked for it.");
        System.out.println("-----------------------------");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Your winning the $10,000 probability is: 1" + "/" + (100-10));
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Your winning the $3,000 probability is: 1" + "/" + (100-10));
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Your winning the $1,000 probability is: 4" + "/" + (100-10));
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Your winning the $5 probability is: 84" + "/" + (100-10));
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Each Round's Expected Income: " + "$" + ((10000*1/90) + (3000*1/90) + (1000*4/900) + (5*84/90)));


        System.out.println("-----------------------------");
    }
}

/*BONUS (probability - 3 points): 
73
73: 10.000 USD
37: 3.000 USD
71, 17, 31, 13: 1.000 USD

•If the user input matches the lottery in exact order, the award is $10,000.
•If the user input matches the lottery, the award is $3,000.
•If one digit in the user input matches a digit in the lottery, the award is $1,000.

Write a program that randomly generates a lottery of a two-digit number, prompts the user to enter a two-digit number, and determines whether the user wins according to the following rule:

Random number generation
List the possible awards
Get an input number within this range from the user
AB:
int B = AB%10
int A = int(AB/10)
CD
int D = CD %10
int C = int(CD/10)

•If the user input matches the lottery in exact order, the award is $10,000.

AB == CD
If ( A == C && B == D)

•Else if the user input matches the lottery, the award is $3,000.

Else if ( AB == (C + 10*D) (reverse order here)
Else if ( A == D && B == C) (same with the upper line)

AB & CD
•If one digit in the user input matches a digit in the lottery, the award is $1,000.
Else if ( (A == C) || ( A == D) || ( B == C ) || ( B == D ) )
	Print 1.000 USD
Else: 5 USD

11, 12, 13, … 99 (0 excluded)
10 USD






Random number generation from 10 to 99
We need to get input from the user (2-digit)
firstDigit = number %10
secondDigit = int(number/10)
Check the conditions: 
73 and 73
If (lottery == number) print 10000 USD
73 and 37
Else if ((lottery%10==int(number/10)) && (int(lottery/10)==number %10)) print 3000
73 and 38
73 and 53
73 and 71
73 and 17
Else if ((lottery%10==secondDigit) || (int(lottery/10)==firstDigit) || (lottery%10==firstDigit) || (int(lottery/10)==secondDigit) || ) 	1000 USD

Else print 0 USD

•If the user input matches the lottery in exact order, the award is $10,000.
•If the user input matches the lottery, the award is $3,000.
•If one digit in the user input matches a digit in the lottery, the award is $1,000.

PROBABILITY HESABI YAP
    Expected outcome hesabı yap

*/