package task8;
import java.util.Arrays;

public class task8e {
    public static void main(String[] args) {

        int [ ] primeList = new int [100];

        primeList [0] = 2;
        int number = 3;
        int counter = 1;

        while (number < 101) { 
            if (isPrime (number)) { 
                primeList [counter] = number;
                counter = counter + 1;
            }
            number = number + 2; 
        }

        //System.out.println(Arrays.toString(primeList));  this array contains unnecessary zeros

        int [] primeListFinished = Arrays.copyOf(primeList, counter);
        System.out.println("----------------------------------------------");
        System.out.println("Prime numbers between 0-100:");
        System.out.println(Arrays.toString(primeListFinished));
        System.out.println(primeListFinished.length + " prime numbers between 0-100.");
        System.out.println("----------------------------------------------");
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