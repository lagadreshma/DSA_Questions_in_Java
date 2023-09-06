package Basic.NumberConversion;
import java.util.Scanner;

public class octalToDecimal {

    public static int findDecimal(int octal){

        int decimal = 0, i = 0;

        while(octal != 0){

            int rem = octal % 10;
            decimal = decimal + rem * (int) Math.pow(8, i);
            octal = octal / 10;

            i++;

        }

        return decimal;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Octal Number : ");
        int octal = sc.nextInt();

        System.out.println("Decimal Number of " + octal + " is : " + findDecimal(octal));

    }

}
