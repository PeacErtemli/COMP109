package task7;
import java.util.Scanner;

public class task7b {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.print("Type a number to learn it's the highest divisor: ");
        int input_num = input.nextInt();
        System.out.print(highestDivisorV2(input_num));

        input.close();
    }

    public static int highestDivisorV1(int num) {
        int counter = 2;
        while (counter <= (num / 2)) {
            if (num % counter == 0) {
                int result = num / counter;
                return result;
            }
            counter = counter + 1;
        }
        return 1;
    }
    

    public static int highestDivisorV2(int num) {  // Faster way to do.
        
        int counter = 2;
        if (num % counter == 0) {  // checks for every even numbers, 2 is enough.
            int result = (int) num/counter;
            return result;
        }

        counter = 3;

        while (counter <= (int) num/3) {
            if (num % counter == 0) {
                int result = (int) num/counter;
                return result;
            }
            counter = counter + 2;
        }
        return 1;
    }
}
