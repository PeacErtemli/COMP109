package task8;
import java.util.Scanner;

public class task8a {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.print("Type a number to learn if it's an Armstrong Number: ");
        int input_num = input.nextInt();

        System.out.println("------------");
        if (isArmstrongNum(input_num)) {
            System.out.print("It is an Armstrong Number!");
        } else {
            System.out.print("It is NOT an Armstrong Number!");
        }
        input.close();
    }

    public static Boolean isArmstrongNum (int num) {
        int sum = 0;
        int rem = 0;
        int numOrg = num;
        int count = howManyDigits(num);

        while ( num!=0 ) {
            rem = num%10;
            sum += Math.pow(rem, count);
            System.out.println("num: " + num);
            System.out.println("last digit addition: " + rem + " ^ " + count + " = " + (int) Math.pow(rem, count));
            System.out.println("sum: " + sum);
            System.out.println("------------");
            num = num/10;
        }
        return sum == numOrg;
    }
    
    public static int howManyDigits(int num) {

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count += 1;
        } return count;
    }
}

// 123, 25 no
// 153, 370, 1634, 54748 yes