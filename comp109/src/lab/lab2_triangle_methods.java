package lab;
import java.util.Scanner;

public class lab2_triangle_methods {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("--------------------"); // indicator
        System.out.print("Please enter the sides of the triangle: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (isValid(a, b, c)) {
            System.out.println("--------------------"); // indicator
            System.out.println("Side 1 is: " + a);
            System.out.println("Side 2 is: " + b);
            System.out.println("Side 3 is: " + c);

            System.out.println("--------------------"); // indicator
            System.out.println("The PERIMETER of the triangle is: " + getPerimeter(a, b, c));
            System.out.println("The AREA of the triangle is: " + getArea(a, b, c));
            System.out.println("--------------------"); // indicator
        } else {
            System.out.println("--------------------"); // indicator
            System.out.println("Invalid input.");
            System.out.println("--------------------"); // indicator
        }
        input.close();
    }

    public static boolean isValid(int side1, int side2, int side3) {
        if ((side1<(side2+side3)) && (side2<(side1+side3)) && (side3<(side1+side2))) {
            return true;
        } else {
            return false;
        }
    }

    public static int getPerimeter(int side1, int side2, int side3) {
        int perimeter = side1 + side2 + side3;

        return perimeter;
    }

    public static double getArea(int side1, int side2, int side3) {
        int s = side1 + side2 + side3 / 2;
        double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);

        return area;
    }
}
