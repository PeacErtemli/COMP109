package task8;
import java.util.Arrays;

public class task8d {
    public static void main(String[] args) {

        int[ ] myGrades = {10, 133, 45, 99, 78, 65, 76};

        System.out.println("----------------------------------------------");
        System.out.println("Your array: " + Arrays.toString(myGrades));
        System.out.println("--------------------------");
        System.out.println("Max of numbers is: " + maxElement(myGrades));
        System.out.println("----------------------------------------------");
        
    }

    public static int maxElement (int myGrades[]) {
        int max = myGrades [0];
        int i = 1;
        while ( i < myGrades.length ) {
            if ( myGrades [i] > max ) {
                max = myGrades [i];
            }
        i++;
        }
        return max;
    }       
}
