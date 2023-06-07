package task7;
import java.util.Scanner;

public class task7c {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.print("Type a number to learn it's sum of digits: ");
        int input_num = input.nextInt();
        
        System.out.print("Sum of it's digits: " + sumOfDigits(input_num));

        System.out.print("\n");
        System.out.print("-------------------------------");

        input.close();
    }

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}

/*TASK-7C: Please write an integer method that will calculate and return the sum of digits of an input number.

sumOfDigits ( 125 ) : 8 

public static int sumOfDigits ( int num ) { 
	int sum = 0;
	while ( num!=0 ) {
		sum += num%10;
		num = num/10;
	}
	return sum;
}
 */