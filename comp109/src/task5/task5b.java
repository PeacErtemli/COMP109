package task5;
import java.util.Scanner;

public class task5b {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.print("Type a number: ");
		int input_num = input.nextInt();
		input.close();

		if (factorial_while(input_num) > 0) {

			System.out.println(input_num + "! is " + factorial_while(input_num) + "."); // 5! is 120.

			for (int i = 1; i <= input_num; i++) { // gives the opening formula of factorial for input_num
				System.out.print(i);
				if (i == input_num) break;
				System.out.print(" x ");
			}

			System.out.print(" = " + factorial_while(input_num));
			System.out.print("\n");

		} else {
			System.out.println("Negative numbers are not factorial.");
		}
		System.out.println("-------------------------------");
    }

    public static int factorial_while(int num) {
        int product = 1;

		if (num == 0) return 1;
		else if (num<0) return -1;

		while (num != 1) {
			product = product * num;
			num = num - 1;
		}
		return product;
    }

    public static int factorial_for(int num) {
		int product = 1;
		for (int i = num; i != 1; i = i - 1) {
			product = product * i;
		}

		return product;
    }
}

/*TASK-5X: Please write and run the code for a “factorial number”  method that we have covered during the class. Moreover, please explain this code with 3 example cases.

factorial (5) : 5! =  1*2*3*4*5 = 120
Pseudocode:
A variable needed: product
Loop action from n until 2:
		product = product * n;
Return value

public static int factorial (int num) {

	int product = 1;
	while ( num != 1) { 
		product = product * num;  
		num = num - 1;
	}
	return product;
}

public static int factorial_for (int num) {

	int product = 1;
	for ( i = num; i != 1; i = i - 1) { 
		product = product * i;
	}
	return product;
}
 */