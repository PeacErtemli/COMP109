package lab;
import java.util.Scanner;

public class lab3_minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------"); // indicator
        System.out.print("Enter a sequence of integers (enter 0 to end the input): ");
    
        int minNum = Integer.MAX_VALUE; // initialize minimum number as the largest possible value (2.147.483.647)
        int minCount = 0; // counter variable for minimum numbers
    
        while (true) {
            int tempInput = input.nextInt();
            if (tempInput == 0) {
                break;
            }
            if (tempInput < minNum) {
                minNum = tempInput;
                minCount = 1; // reset counter if a new minimum is found
            } else if (tempInput == minNum) {
                minCount++; // increment counter if another minimum is found
            }
        }
    
        input.close(); // close Scanner object
    
        System.out.println("The minimum number is: " + minNum + " with " + minCount + " occurrence(s)");
        System.out.println("--------------------");
    }
}

// try 2 3 4 5 1 2 -5 -3 -99 5 3 2 -99 5 6 -99 -50