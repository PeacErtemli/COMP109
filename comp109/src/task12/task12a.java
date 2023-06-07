// Selection Sort

package task12;
import java.util.Random;
import java.util.Arrays;

public class task12a {
    public static void main(String[] args) {
        Random rand = new Random();

        int [] unsortedArray = {rand.nextInt(1, 10),
                                rand.nextInt(1, 10),
                                rand.nextInt(1, 10),
                                rand.nextInt(1, 10),
                                rand.nextInt(1, 10)};
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Unsorted random list: " + "\t" +  Arrays.toString(unsortedArray));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        selectionSort(unsortedArray);
        System.out.println("Sorted random list: " + "\t" + Arrays.toString(unsortedArray));
        System.out.println("------------------------------------------------------------");
    }

    public static int[] selectionSort(int[] array) {

        int temp; // swapping dummy
        int min_idx;

        for (int i = 0; i < array.length; i++) {
            min_idx = i; // min_idx = 0;

            System.out.println("\t" + "Step " + (i) + ": " + "\t" +  Arrays.toString(array));
            System.out.println("------------------------------------------------------------");

            for (int j = i + 1; j < array.length; j++) {
                if (array[min_idx] > array[j]) // 3 > 2? 2 >1?
                    min_idx = j;
            }

            // Swapping operation
            temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;
        }
        return array;
    }
}