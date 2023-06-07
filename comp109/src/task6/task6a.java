package task6;
import java.util.Scanner;

public class task6a {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.print("Type a number to learn if it's a prime number: ");
        int input_num = input.nextInt();
        
        if (isPrime(input_num) == true) {
            System.out.print("It is a prime number!");
        } else {
            System.out.print("It is NOT a prime number!");
        }
        input.close();
    }

    public static Boolean isPrime (int num) {
        if (num < 2) return false;
        else {
            for (int i = 2; i <= (int)(num/2); i++) {
                if (num % i == 0) return false; // if num can be divided by i, it'll return false.
            }
            return true;
        }
    }
}
/*Prime numbers: any number that is only divisible by 1 and itself but not divisible by anything else. 

2, 3, 5, 7, 11, 13, 17, 19

433
Dividing by prime numbers (all of the odd numbers?)
NUM : 2, 3, 4, 5, 6, …. until itself OR int(NUM/2)
11? 2, 3, 4, 5, 5.5 < 6? 7? 8? 9? 10?

0, 1, -1, -2, -3… NOT prime numbers

public static Boolean isPrime (int num) {

	if (num < 2) return false;
	else {
		int i = 2;
		while ( i <= int(num/2)) {
			if (num % i == 0) return false; 
			i = i + 1;
		}
		return true;
}
 */