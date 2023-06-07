package task7;
import java.util.Scanner;

public class task7a {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.print("Type a number to learn the Fibonacci number at your input position: ");
        int input_num = input.nextInt();
        System.out.print(checkFibonacci(input_num));

        System.out.print("\n");
        System.out.print("-------------------------------");

        input.close();
    }

    public static int checkFibonacci(int num) {
        int n1 = 0;
        int n2 = 1;
        int temp;

        for (int i = 1; i <= num; i++) {

            if (i == num) {
                System.out.print("Fibonacci " + i + " is: ");
            }
            temp = n1;
            n1 = n2;
            n2 = n1 + temp; 
        }

        return n1;
    }

}

/*Case-study: Fibonacci Numbers

1	1	2	3	5	8	13	21	34	55	89…..

8 verdim, 8. fibonacci sayısı*/