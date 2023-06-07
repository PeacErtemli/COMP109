// FINDING THE ELEMENTS WHICH BELOW THE AVERAGE OF A GIVEN ARRAY

package lab;

import java.util.Arrays;
import java.util.Random;
import java.text.DecimalFormat;

public class lab5_1Darray {

    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {
        Random random = new Random();
        int[] list = new int[10];
        double list_sum = 0;
        int counter = 0;

        for (int i = 0; i < list.length; i++) { // Creates, sums and counts the numbers.
            list[i] = random.nextInt(1, 100);
            list_sum += list[i];
            counter++;
        }

        double list_avg = list_sum / counter; // Average of the list.

        System.out.println("----------------------------------------------");
        System.out.println("Random array: " + Arrays.toString(list));
        System.out.println("Sum: " + (int) list_sum);
        System.out.println("Count: " + counter);
        System.out.println("Average: " + df.format(list_avg));
        System.out.println("There are " + belowAvgCounter(list, list_avg) + " elements BELOW the average.");
        System.out.println("Below Average Elements: " + Arrays.toString(belowAvgList(list, list_avg)));
        System.out.println("----------------------------------------------");
    }

    public static int belowAvgCounter(int[] list, double average) { // Counts the below average elements.

        int counter = 0;

        for (int element : list) {
            if (element < average) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] belowAvgList(int[] list, double average) { 

        int[] belowAvgList = new int[belowAvgCounter(list, average)];

        int i = 0; // index of the belowAvgList

        for (int element : list) {
            if (element < average) {
                belowAvgList[i] = element;
                i++;
            }
        }
        return belowAvgList;
    }
}
