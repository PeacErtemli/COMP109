package lab;
import java.util.Scanner;

public class lab1_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("--------------------"); // indicator
        System.out.print("Please enter the sides of the triangle: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a<(b+c)) && (b<(a+c)) && (c<(a+b))) {
            System.out.println("--------------------"); // indicator
            System.out.println("Side 1 is: " + a);
            System.out.println("Side 2 is: " + b);
            System.out.println("Side 3 is: " + c);
            int perimeter = a + b + c;
            System.out.println("The PERIMETER of the triangle is: " + perimeter);
            int s = perimeter / 2;
            double area = Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
            System.out.println("The AREA of the triangle is: " + area);
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------"); // indicator
            System.out.println("Your inputs are invalid.");
            System.out.println("Please make sure your inputs form a triangle.");
            System.out.println("--------------------"); // indicator
        }
        input.close();
    }
}
