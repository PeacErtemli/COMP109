package task6;
import java.util.Scanner;

public class task6b {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.print("Type a number to learn if it's a prime number: ");
        int input_num = input.nextInt();
        
        if (isPrimeV2(input_num) == true) {
            System.out.print("It is a prime number!");
        } else {
            System.out.print("It is NOT a prime number!");
        }
        input.close();
    }

    public static Boolean isPrimeV2 (int num) {

        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false; //checks for the even numbers.
        else {
            for (int i = 3; i <= (int) (num/2); i = i + 2) { // checks for the odd numbers.
                if (num % i == 0) return false;
            }
            return true;
        }
    }
}

/*public static Boolean isPrimeV2 (int num) {

	if (num < 2) return false;
	else if (num == 2) return true;
	else if (num%2==0) return false;
else {
		int i = 3;
		while ( i <= int(num/2)) {  // please also consider this! 
			if (num % i == 0) return false; 
			i = i + 2;
		}
		return true;
}

NOTE: instead of using this statement, i <= int(num/2), as the loop continuation condition, you are advised to try sqrt.
 */