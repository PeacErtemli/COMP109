// Insertion Sort

package task12;

import java.util.Random;
import java.util.Arrays;

public class task12b {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = { rand.nextInt(1, 100),
                rand.nextInt(1, 100),
                rand.nextInt(1, 100),
                rand.nextInt(1, 100),
                rand.nextInt(1, 100),
                rand.nextInt(1, 100),
                rand.nextInt(1, 100),
                rand.nextInt(1, 100),
                rand.nextInt(1, 100),
                rand.nextInt(1, 100) };

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Unsorted random list: " + "\t" + Arrays.toString(array));
        System.out.println("----------------------------------------------------------------------");
        insertionSort(array);
        System.out.println("Sorted random list: " + "\t" + Arrays.toString(array));
        System.out.println("----------------------------------------------------------------------");
    }

    public static int [] insertionSort (int [] myArray) {

        int currentElement;
        int j;

        for (int i = 1; i < myArray.length; i++) {
            currentElement = myArray[i];
            j = i - 1;
            while ( j >= 0 && myArray[j] > currentElement) { // Pulling j back as it needs to be
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }
            myArray[j + 1] = currentElement;
            System.out.println(" Focused" +  " Index " + (i) + "\t" +  Arrays.toString(myArray));
            System.out.println("----------------------------------------------------------------------");
        }
        return myArray;
    }
}