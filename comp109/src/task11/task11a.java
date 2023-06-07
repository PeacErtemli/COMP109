// MULTIPLICATION TABLE

package task11;

public class task11a {
    public static void main(String[] args) {

        int[][] multipTable = new int[10][10];

        for (int y = 0; y < multipTable.length; y++) {
            for (int x = 0; x < multipTable[y].length; x++) {
                multipTable[y][x] = (y + 1) * (x + 1);
                System.out.print(multipTable[y][x]);
                System.out.print("\t");
            }
            System.out.println(); // Goes to the new line after every row finishes.
        }
    }
}
