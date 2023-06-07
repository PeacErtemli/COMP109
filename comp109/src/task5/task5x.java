// VİDEOSU ÇEKİLMEYECEK

package task5;
import java.util.Scanner;

public class task5x {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("What is your weight? (in kg): ");
        double weight = input.nextDouble();
        System.out.print("What is your height? (in meters with ','): ");
        double height = input.nextDouble();
        input.close();

        System.out.println("--------------------"); // indicator
        System.out.println("Your BMI class is: " + bmiClass(weight, height));
        System.out.println("--------------------"); // indicator
    }

    public static String bmiClass(double weight, double height) {
        double bmi = weight / (height*height);

        if (bmi > 35) return "Obese Class 2";
        else if (bmi > 30) return "Obese Class 1";
        else if (bmi > 25) return "Overweight";
        else if (bmi > 18.5) return "Normal";
        else if (bmi > 17) return "Mild Thinnes";
        else if (bmi > 16) return "Moderate Thinness";
        else if (bmi <= 16 && bmi > 5) return "Obese Class 1";
        else return "Invalide Value!";
    }
}

/*TASK-5X: Please run the BMI calculator function and in the main part please provide if-else statements (you need to prepare this part related to our previous exercises in class) and demonstrate how they work in 7 different test conditions. 

public static String bmiClass ( double weight, double height) {
	double bmiValue = weight / (height*height);
	if (bmiValue > 35) return “Obese Class II”;
	else if (bmiValue > 30) return “Obese Class I”;
	else if (bmiValue > 25) return “Overweight”;
	else if (bmiValue > 18.5) return “Normal”;
	else if (bmiValue > 17) return “Mild Thinness”;
	else if (bmiValue > 16) return “Moderate Thinness”;
	else if (bmiValue <= 16 && bmiValue >5) return “Severe Thinness”;
	else return “Invalid Value!”
}
 */


/*
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
 */