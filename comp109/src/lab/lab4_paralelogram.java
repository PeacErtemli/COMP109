package lab;

public class lab4_paralelogram {
    public static void main(String[] args) {
        int nRows = 4;

        for (int row = 1; row <= nRows; row++) {

            for (int i = 0; i < row-1; i++)
                System.out.print(" "); // display a blank space in each iteration
            
            for (int i = 0; i <= 8 - 2*row; i++)
                System.out.print((8 - (2*row - 1)) - i);
            
            for (int i = 0; i < 2 * row - 1; i++)
                System.out.print("*"); // display a star in each iteration // print a newline to end each row
                System.out.println(); // print a newline to end each row
        }
    }
}
