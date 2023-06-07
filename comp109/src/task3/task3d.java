package task3;
import java.util.Scanner;

public class task3d {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int input_year = input.nextInt();
		System.out.println("-----------------------------");

		if ((input_year % 4 == 0) && (input_year % 100 != 0) || (input_year % 400 == 0)) {
			System.out.println(input_year + " is a leap year!");
		} else {
			System.out.println(input_year + " is NOT a leap year!");
		}
		
		System.out.println("-----------------------------");
		input.close();
	}
}

/*TASK-3D: 
Please provide a piece of code to determine whether an entered number is a leap year or not: 

It should be divisible by 4 but not 100
OR
divisible by 400

Examples:
800: Leap year
500: Not a leap year
2004: Leap year
2100: Not a leap year


Get an integer number from the user:

if (year % 400 == 0) Leap year
else if (year%4==0 && year%100 != 0) Leap year
else: Not a leap year

If ((year % 400 == 0) || (year%4==0 && year%100 != 0)) Leap year
Else: not a leap year

Pseudocode:

Display a message to enter a value:
We get an input from the user
We determine whether the input value is a leap year or not

If (year%400==0)
	print Leap Year
Else if (year%4==0 && year%100!=0)
	print leap year
Else
	print not a leap year

-------------------------------------------------------------------------------

If (year%400==0 || (year%4==0 && year%100!=0))
	print Leap Year
Else
	print not a leap year
 */