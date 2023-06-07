package task3;
import java.util.Scanner;
import java.util.Random;

public class task3b {
    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random rand = new Random();

		int firstNumber = rand.nextInt(1, 10); // origin included but bound is excluded
		int secondNumber = rand.nextInt(1, 10);
		int sum = firstNumber + secondNumber;

		System.out.println("-------------------------------");
        System.out.print("What is " + firstNumber + " + " + secondNumber + "?: ");
		int student_answer = input.nextInt();

		if (sum == student_answer) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong, but the answer is " + sum + ".");
		}
		System.out.println("-------------------------------");
		input.close();

	}
}

/*This example creates a program to let a first grader practice additions.
The program randomly generates two single-digit integers number1 and number2 and displays a question such as “What is 7 + 9?” to the student.
After the student types the answer, the program displays a message to indicate whether the answer is true or false.

Math.random [0, 1) function to generate two integers
You want an integer number from 0 to 9
Multiply by 10 and then convert it to integer
What about generating this from 1 to 9?
Random * K (9) + M (1)
K = 9 and M = 1
	int num1 = int(Math.random() * 10); 
int num2 = int(Math.random() * 10);
int sum = num1 + num2;
2 integer variables to be displayed in this question:
Println ( “What is num1 + num2?”)
Get an input integer number from the user (Scanner object, nextInt)
Scanner input = new scanner(System.in);
int response = input.nextInt();
Check whether the sum (num1 + num2) is equal to the given integer (response)
If condition to check this equality
If true, “Correct!”
If not, “Wrong answer but the answer is SUM!” */