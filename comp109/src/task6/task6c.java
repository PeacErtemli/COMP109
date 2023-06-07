package task6;
import java.util.Scanner;

public class task6c {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.print("Type a number to learn if it's a perfect number: ");
        int input_num = input.nextInt();
        
        if (isPerfect(input_num) == true) {
            System.out.println("It's a perfect number!");
        } else {
            System.out.println("It's NOT a perfect number!");
        }
        System.out.println("-------------------------------");
        input.close();
    }
    public static Boolean isPerfect (int num) { 

        int sum = 0;
        for (int i = 1; i <= (int) (num/2); i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        
        if (sum==num) return true;
        else return false;
    } 
}

/*TASK-6C: A perfect number is a number whose sum of its divisors is equal to itself. 

Examples: 
6 = 1 + 2 + 3
8 != 1 + 2 + 4 (7)
28 = 1 + 2 + 4 + 7 + 14

public static Boolean isPerfect ( int num ) { 

	int sum = 1;
	int i = 2;
	while ( i <= int(num/2) ) {
        if ( num % i == 0) 
	        sum = sum + i;
		i = i + 1;
	
	}
    return sum == num;
}

if (sum==num) return true;
else return false;
 */