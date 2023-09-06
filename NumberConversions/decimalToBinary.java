package Basic.NumberConversion;
import java.util.Scanner;

public class decimalToBinary {

    public static long findBinary(int decimal){

        long binary = 0, i = 1;

        while(decimal != 0){

            int rem = decimal % 2;
            binary = binary + rem * i;
            decimal = decimal / 2;

            i *= 10;

        }

        return binary;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        int decimal = sc.nextInt();

        System.out.println("Binary Number of " + decimal + " is : " + findBinary(decimal));

    }

}
