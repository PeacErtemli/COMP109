package task2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class task2b {

    private static final DecimalFormat df = new DecimalFormat("0.0000");
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please write the value of TL for converting to other currencies: ");
        double turkishLira = input.nextDouble();

        double usDollar = turkishLira/18.90;
        System.out.println("------------------");
        System.out.println((int) turkishLira + " TL" + " is:");
        System.out.println();
        System.out.println(df.format(usDollar) + " USD");

        double Euro = turkishLira/20;
        System.out.println(df.format(Euro) + " Euro");

        double Dinar = turkishLira/61.29;
        System.out.println(df.format(Dinar) + " Dinar");

        double Sterlin = turkishLira/22.64;
        System.out.println(df.format(Sterlin) + " Sterlin");

        double Yen = turkishLira/0.14;
        System.out.println(df.format(Yen) + " Yen");

        double Frang = turkishLira/20.10;
        System.out.println(df.format(Frang) + " Frang");

        double Bitcoin = turkishLira/420608;
        System.out.println(df.format(Bitcoin) + " Bitcoin");

        double Ethereum = turkishLira/29524;
        System.out.println(df.format(Ethereum) + " Ethereum");

        double BNB = turkishLira/5450;
        System.out.println(df.format(BNB) + " BNB");

        double dogeCoin = turkishLira/1.44;
        System.out.println(df.format(dogeCoin) + " Dogecoin");
        System.out.println("------------------");
        
        input.close();
    }
}

/*TASK-2B: Please write a piece of code in Java to provide a currency converter that will change the value of Turkish lira (default 200 TL) to other currencies. Please do it for 10 different currencies. 

Scanner input = new Scanner (system.in);
Print (“Please write the value of TL for converting to USD”);
double turkishLira = input.nextDouble();

double usDollar = turkishLira/18.90;
Print (“This is the value in USD: “ + usDollar);

USD
Euro
Dinar
Sterlin/pound
Yen
İsviçre Frangı*/