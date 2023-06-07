package task8;
import java.util.Scanner;
import java.util.Arrays;

public class task8b {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("----------------------------------------------------------");

        double [ ] myList = new double [20];

        for (int i = 0; i < myList.length; i++) {
            System.out.print("[" + (i+1) + "] Please enter a double value, I'll store them: ");
            myList [ i ] = input.nextDouble();
        }
        
        System.out.println(Arrays.toString(myList)); // Convert array to a String and prints.

        input.close();
    }
}
