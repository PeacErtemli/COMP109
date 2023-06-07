package task4;
import java.util.Scanner;

public class task4c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
        int input_year = input.nextInt();

        System.out.println("-----------------------------");
        
        if (isLeapYear(input_year)) {
            System.out.println(input_year + " is a leap year!");
        } else {
            System.out.println(input_year + " is NOT a leap year!");
        }

        System.out.println("-----------------------------");
        input.close();
    }

    public static Boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
            return false;
		}
	}
}

// try 1900, 2000