package task2;
import java.util.Scanner;

public class task2c {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please write the seconds that you want to calculate: ");
        double inputSeconds = input.nextDouble();

        double doubleDays = inputSeconds / 86400; // (86400 = 24*60*60) 86400 seconds in a day
        System.out.println("--------------------"); // indicator
        System.out.println((int) inputSeconds + " seconds means:"); // converts inputSeconds to int from double
        System.out.print((int) doubleDays + " Days"); // converts doubledays to int from double
        double seconds = inputSeconds % 86400; // calculates the remainder seconds after the days got removed

        double doubleHours = seconds / 3600; // 3600 seconds in an hour
        System.out.print(" " + (int) doubleHours + " Hours");
        seconds = seconds % 3600;

        double doubleMinutes = seconds / 60; // seconds in a minute
        System.out.print(" " + (int) doubleMinutes + " Minutes");
        seconds = seconds % 60;

        // No need for doubleSeconds because seconds are what we are looking for.
        System.out.print(" " + (int) seconds + " Seconds");
        double milliseconds = seconds % 1000;

        System.out.print(" " + (int) milliseconds + " Milliseconds");
        System.out.println("\n" + "--------------------");
        input.close();
    }
}

/*TASK-2C: Please write a piece of code in Java to calculate the values in days, hours, minutes, seconds, and milliseconds (0.001 seconds). 

7456123,343 seconds

Pseudocodes
Initial state
Step-by-step instructions
To find the target position/state

Get the input in double
From seconds to minutes, hours, and days
minutes/60
hours/3600
days/(3600*24) – (86400)
Divisor + remainder
double input = seconds;

int days = input / 86400;  (86400 = 24*60*60)
input = input % 86400; (10%7 = 3)

int hours = input / 3600; (60*60 = 3600)
input = input % 3600;

int minutes = input / 60;
input = input % 60;

int seconds = input;
int milliseconds …?*/