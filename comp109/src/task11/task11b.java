// FINDING THE RANGE

package task11;

public class task11b {
    public static void main(String[] args) {

        int[][] myArray = { { 15, 31, 33, 41, 49, 50, 55, 57, 71, 74 },
                            { 23, 26, 34, 41, 47, 53, 57, 59, 63, 79 } };

        System.out.println("-------------------------------");
        System.out.println("Range is: " + arrayRangeVal(myArray));
        System.out.println("-------------------------------");
    }

    public static int arrayRangeVal(int array[][]) {
        int max = array[0][0];
        int min = array[0][0];

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {

                if (array[y][x] < min)
                    min = array[y][x];
                else if (array[y][x] > max)
                    max = array[y][x];
            }
        }
        return (max - min);
    }
}

// EXAM QUESTION !!!