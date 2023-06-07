package task10;

import java.util.Scanner;

public class task10b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Fill the [2,3,3] matrix. ");
        System.out.println("Values can be double type.");
        System.out.println("-------------------------------");

        double[][][] matrix3D = new double[2][3][3];

        for (int k = 0; k < matrix3D.length; k++) {
            for (int y = 0; y < matrix3D[k].length; y++) {
                for (int x = 0; x < matrix3D[k][y].length; x++) {
                    System.out.print("[" + k + "," + y + "," + x + "]" + " Please enter a value:");
                    matrix3D[k][y][x] = input.nextDouble();

                }
            }
        }

        System.out.println("-------------------------------");

        for (int k = 0; k < matrix3D.length; k++) {
            for (int y = 0; y < matrix3D[k].length; y++) {
                for (int x = 0; x < matrix3D[k][y].length; x++) {
                    System.out.print(matrix3D[k][y][x]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }

        input.close();
    }
}
