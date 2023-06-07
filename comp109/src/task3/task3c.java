package task3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class task3c {
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

        if (bmi < 18.5) {
            System.out.println("Your weight status: Underweight");
        } else if (bmi < 25) {
            System.out.println("Your weight status: Normal weight");
        } else if(bmi < 30) {
            System.out.println("Your weight status: Overweight");
        } else {
            System.out.println("Your weight status: Obesity");
        }
        System.out.println("------------------------------");
    }
}

/*TASK-3: 
BMI Score:

Get input data from the user for weight in kg (83.2 kg)
Get input data from the user for height in meters 1.75 meters
Calculate the BMI with the following formula: 
BMI = weight/(height*height)
We provide the conditionals with respect to the given ranges:

if (BMI < 18.5) print underweight
else if (BMI < 25 && BMI>=18.5) {
System.out.print normal
else if (BMI < 30) print overweight
else:  print obese 

if (BMI < 18.5) print underweight
if (BMI < 25 && BMI>=18.5) print normal
if (BMI < 30) print overweight
else:  print obese
*/