// MEAN AND MEDIAN VALUES OF AN ARRAY

package task11;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class task11c {
    public static void main(String[] args) {

        int[] myArray = {7, 84, 17, 74, 47, 95, 71, 22, 40, 78};
        IntStream intStream = IntStream.of(myArray);
        OptionalDouble mean = intStream.average();
        
        System.out.println("-------------------------------");
        System.out.println("Student's Mean: " + arrayMean(myArray));
        System.out.println("Library's Mean: " + mean);
        System.out.println("-------------------------------");
        System.out.println("Student's Median: " + arrayMedian(myArray));
        System.out.println("Library's Median: " + Arrays.toString(myArray) + " Find it yourself.");
        // No library for that, calculate manually. 47+71 = 118 -> 118/2=59
        System.out.println("-------------------------------");
    }

    public static double arrayMean(int[] list) {
        double sum = 0;

        for (int element : list) {
            sum += element;
        }

        double mean = sum/list.length;

        return mean;
    }

    public static double arrayMedian(int[] list) {
        
        Arrays.sort(list);

        if (list.length % 2 == 1) {
            return list[(list.length-1)/2]; // odd
        } else {
            return (list[list.length/2] + list[(list.length/2) - 1])/2; // even
        }
    }
}