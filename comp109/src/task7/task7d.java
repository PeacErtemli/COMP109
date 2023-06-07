package task7;
import java.util.Scanner;

public class task7d {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("-------------------------------");
        System.out.print("Type a number to learn it's digit count: ");
        int input_num = input.nextInt();
        System.out.print(digitCounter(input_num) + " digits");
        
        System.out.print("\n");
        System.out.print("-------------------------------");

        input.close();
    }

    public static int digitCounter(int num) {
        int counter = 0;

        if (num == 0) return 1;

        while (num != 0) {
            num = num/10;
            counter++;
        }
        return counter;
    }
}

/*TASK-7D: Please write an integer method that will calculate and return the count of digits of an input number.
public static int digitCounter ( int num) {
	int counter = 0;
	if (num == 0) return 1;
while ( num != 0) 
		num = num/10;
		counter++;
	}
	return counter;
}
 */