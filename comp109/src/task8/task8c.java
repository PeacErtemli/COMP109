package task8;
import java.util.Arrays;

public class task8c {
    public static void main(String[] args) {
        int num = 0;
        int counter = 0;
        int a;

        int [] myList = {16, 19, 26, 40, 52, 75, 77, 97, 101, 107, 109, 111, 112, 113, 119, 144, 147, 179, 188, 191};

        System.out.println("----------------------------------------------------------");
        System.out.println("Your array: " + Arrays.toString(myList));
        System.out.println("----------------------------------------------------------");

        while ( num < myList.length) { 
            a = myList [ num ];
            if ( isPrime (a)) {
                counter++;
                System.out.println("[" + (counter) + "] " + a + " is a prime number!");
            }
            num++;
        }
        System.out.println("--------------------------");
        System.out.println("We have " + counter + "/" + myList.length + " prime numbers.");
        System.out.println("----------------------------------------------------------");
    }

    public static Boolean isPrime (int num) {
        if (num < 2) return false;
        else {
            if (num % 2 == 0) return false; // checks for even numbers. If its divided, num is a even number which is not prime.
            else {
                for (int i = 3; i <= (int)(num/2); i += 2) { // checks for the odd numbers, if it's divided it's not a prime number.
                    if (num % i == 0) return false;
                }
                return true;
            }
        }
    }
}
