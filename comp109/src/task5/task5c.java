package task5;
import java.util.Scanner;

public class task5c {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("------------------------------");
        System.out.println("Type 3 numbers below to calculate the numbers in a given interval.");
        System.out.println("----------------");
        System.out.print("Small value of an interval: ");
        int input_num1 = input.nextInt();
        System.out.print("Great value of the interval: ");
        int input_num2 = input.nextInt();

        if (input_num2 < input_num1) {
            System.out.println("Second input should be greater than the first input.");
            System.out.println("------------------------------");
            System.exit(0);
        }

        System.out.print("Step value of the calculation: ");
        int input_num3 = input.nextInt();

        System.out.print(" = " + sumUp(input_num1, input_num2, input_num3));

        System.out.print("\n");
        System.out.println("------------------------------");
		input.close();
    }

    public static int sumUp(int num1, int num2, int num3) {

        int sum = 0;

        for (int i = num1; i <= num2; i+=num3){

            System.out.print(i);
            sum = sum + i;

            if (i+num3 > num2) break;
            
            System.out.print(" + ");
        }
        return sum;
    }

    public static int sumUp_while(int num1, int num2, int num3) {

        int sum = 0;
        int i = num1;

        while (i<=num2){
            sum = sum + i;
            i+=num3;
        }
        return sum;
    }
}

/*TASK-5X: Please write a method that will calculate the sum of integers between num1 and num2 with the incrementation of num3.

public static int sumUp ( int num1, int num2, int num3) { 

int sum = 0;
for ( int i = num1; i <= num2; i+=num3) {
		sum = sum + i;
}
return sum;
}

public static int sumUp_while ( int num1, int num2, int num3) { 

int sum = 0;
int i = num1;
while ( i <= num2) {
		sum = sum + i;
i+=num3;
}
return sum;
}
 */