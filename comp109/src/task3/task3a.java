package task3;
import java.util.Scanner;

public class task3a {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.print("What is your numerical grade?: ");
        int num_grade = input.nextInt();
        String letter_grade;

        if (num_grade > 95) {
            letter_grade = "A";
            System.out.println("Your letter grade is: " + letter_grade);
        } else if (num_grade >= 90) {
            letter_grade = "A-";
            System.out.println("Your letter grade is: " + letter_grade);
        } else if (num_grade >= 85) {
            letter_grade = "B+";
            System.out.println("Your letter grade is: " + letter_grade);
        } else if (num_grade >= 80) {
            letter_grade = "B";
            System.out.println("Your letter grade is: " + letter_grade);
        } else if (num_grade >= 75) {
            letter_grade = "B-";
            System.out.println("Your letter grade is: " + letter_grade);
        } else if (num_grade >= 70) {
            letter_grade = "C+";
            System.out.println("Your letter grade is: " + letter_grade);
        } else if (num_grade >= 65) {
            letter_grade = "C";
            System.out.println("Your letter grade is: " + letter_grade);
        } else if (num_grade >= 60) {
            letter_grade = "C-";
            System.out.println("Your letter grade is: " + letter_grade);
        } else if (num_grade >= 55) {
            letter_grade = "D+";
            System.out.println("Your letter grade is: " + letter_grade);
        } else if (num_grade >= 50) {
            letter_grade = "D";
            System.out.println("Your letter grade is: " + letter_grade);
        } else if (num_grade < 50) {
            letter_grade = "F";
            System.out.println("Your letter grade is: " + letter_grade);
        }
        System.out.println("-------------------------------");
        input.close();
    }
}

// switch method (udacity'de var) (olmadı)


/*TASK-3A: Please provide a control flow structure for your letter grades in this course. The user shall give an input between 0 and 105. (If the input value is not in the range then please display “invalid input”).
95+: A
90-94.9: A-
85-89.9: B+
….
54.9-50: D
0-49.9: F*/