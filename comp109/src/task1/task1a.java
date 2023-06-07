package task1;
import java.util.Scanner;

public class task1a {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input the first number: ");
    int num1 = input.nextInt();
    System.out.print("Input the second number: ");
    int num2 = input.nextInt();
    System.out.print("Input the third number: ");
    int num3 = input.nextInt();
    int sum = num1 + num2 + num3;
    input.close();
    System.out.println();
    System.out.println("Sum: "+sum);
  }
}
