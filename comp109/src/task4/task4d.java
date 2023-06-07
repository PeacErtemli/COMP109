package task4;
import java.util.Random;

public class task4d {
    public static void main(String[] args) {
        System.out.println("--------------------"); // indicator
        System.out.println("Coin tossed:");
        System.out.println(coinGen());
        System.out.println("--------------------"); // indicator
        System.out.println("Dice rolled: ");
        System.out.println(diceGen());
        System.out.println("--------------------"); // indicator
    }

    public static String coinGen() {
        Random rand = new Random();

        int randNum = rand.nextInt(1, 3); // 1 included, 3 excluded. So [1,2]

        //System.out.println(randNum);

        if (randNum == 1) {
            return "Head";
        } else { // other possibility is just randNum = 2
            return "Tail";
        }
    }

    public static int diceGen() {
        Random rand = new Random();

        int randNum = rand.nextInt(1, 7); // 1 included, 7 excluded. So just [1,2,3,4,5,6]

        return randNum;

        /*if (randNum < 1/6.0) {
            return 1;
        } else if (randNum < 2/6.0) {
            return 2;
        } else if (randNum < 3/6.0) {
            return 3;
        } else if (randNum < 4/6.0) {
            return 4;
        } else if (randNum < 5/6.0) {
            return 5;
        } else {
            return 6;
        }*/
    }
}

/*TASK-4D: Please write two methods: (1) a dice method that will produce random integer numbers between 1 and 6 (both included),
(2) a coin method that will produce head or tail for a single case randomly. */