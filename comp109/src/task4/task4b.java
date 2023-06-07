package task4;
import java.util.Scanner;
import java.text.DecimalFormat;

public class task4b {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("--------------------"); // indicator
        System.out.print("Give the radius of the circle: ");
        int radius = input.nextInt();
        input.close();

        if (radius > 0) {
            System.out.println("Area: " + df.format(find_area(radius)));
            System.out.println("Perimeter: " + df.format(find_perimeter(radius)));
            System.out.println("--------------------"); // indicator
        } else {
            System.out.println("Please provide a positive radius value and try again.");
        }
    }

    public static double find_area(double radius) {
        double area = Math.PI*radius*radius;
        
        return area;
    }
    
    public static double find_perimeter(double radius) {
        double perimeter = 2*Math.PI*radius;

        return perimeter;
    }
}

/*TASK-4B: You are required to calculate the area and perimeter of a circle but you need to check whether the given radius is suitable or not ( r > 0). 

Get an input value from the user (float or double)
We will check if the value (radius) is greater than 0 then we will do the calculations if (radius > 0) 
Otherwise we will return that the input value is not valid to calculate the area and perimeter of a circle, since it is zero or a negative number (else: ….)
*/