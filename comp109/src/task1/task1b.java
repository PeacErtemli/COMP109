package task1;
import java.util.Scanner;

public class task1b {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input your first name: ");
    String fname = input.next();
    System.out.print("Input your last name: ");
    String lname = input.next();
    input.close();
    System.out.println();
    System.out.println("Hello, "+fname+" "+lname);
  }
}
