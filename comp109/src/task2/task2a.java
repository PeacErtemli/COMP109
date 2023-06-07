package task2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class task2a {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("What is your weight? (in kg): ");
        double weight = input.nextDouble();
        System.out.print("What is your height? (in meters with ','): ");
        double height = input.nextDouble();
        double bmi = weight / (height*height);
        input.close();

        System.out.println("------------------------------");
        System.out.println("Your BMI score is: " + df.format(bmi));
        System.out.println("------------------------------");
    }
    
}

/*TASK-2A: Please write a piece of code
in Java that will calculate the body-mass index (BMI)
with the inputs from the user for weight and height.

Pseudocode:
Scanner input = new Scanner (system.in);
Print to get weight (in kg)
double weight = input.nextDouble();
Print to get height (in meters)
double height = input.nextDouble();
double bmi = weight / (height*height)
system.out.println(“Your BMI score is: “+ bmi);*/