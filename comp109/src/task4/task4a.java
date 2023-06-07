package task4;
import java.util.Scanner;

public class task4a {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("--------------------"); // indicator
        System.out.print("Give two numbers to learn which one is greater: ");
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        if (input1 == input2) {
            System.out.println("They're equal!");
            System.out.println("--------------------"); // indicator
        } else {
            int higher_one = maxOfTwoNum(input1, input2);
            System.out.println(higher_one + " is greater!");
            System.out.println("--------------------"); // indicator
        }
        input.close();
    }

    public static int maxOfTwoNum(int num1, int num2) {
        if (num1>num2) {
            return num1;
        } else {
            return num2;
        }
    }
}

/*TASK-4A: Please get two input values from the user and determine the higher value. 

Get two input numbers from the user (num1, num2)
If (num1 > num2) print(“num1 is greater than num2”)
Else if (num2> num1) print(“num2 is greater than num1”)
Else: print (“They are equal to each other”) 

int higher_one = Math.max (num1, num2);
int lower_one = Math.min (num1, num2);
 */