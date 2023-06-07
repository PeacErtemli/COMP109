package task10;

public class task10a {
    public static void main(String[] args) {
        int[][] matrix = new int[7][8];

        for (int y = 0; y < matrix.length; y++) { // For loop for the y axis, rows
            for (int x = 0; x < matrix[y].length; x++) { // For loop for the x axis, columns
                matrix[y][x] = (int) ((Math.random() * 63) + 15); // Creates random integers between 15 (inc.) and 78
                                                                  // (exc.)
                System.out.print(matrix[y][x]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
