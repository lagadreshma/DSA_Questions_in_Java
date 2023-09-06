package Basic.NumberConversion;
import java.util.Scanner;

public class binaryToDecimal {

    public static int findDecimal(long binary){

        int decimal = 0, i = 0;

        while(binary != 0){

            int rem = (int)(binary % 10);
            decimal = decimal + rem * (int)Math.pow(2,i);
            binary = binary / 10;
            i++;

        }

        return decimal;

    }

    public static void main(String args[]){

        // binary = 0100
        // decimal = 4

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any binary number : ");
        long binary = sc.nextLong();

        System.out.println("Decimal Number of " + binary + " is : " + findDecimal(binary));


    }

}
