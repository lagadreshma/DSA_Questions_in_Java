package Basic.NumberConversion;
import java.util.Scanner;

public class decimalToOctal {

    public static int findOctal(int decimal){

        int octal = 0, i = 1;

        while(decimal != 0){

            int rem = decimal % 8;
            octal = octal + rem * i;
            decimal = decimal / 8;

            i *= 10;

        }

        return octal;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        int decimal = sc.nextInt();

        System.out.println("Octal Number of " + decimal + " is : " + findOctal(decimal));

    }

}
