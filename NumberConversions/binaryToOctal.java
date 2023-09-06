package Basic.NumberConversion;
import java.util.Scanner;

public class binaryToOctal {

    public static int findOctal(long binary){

        //  binary -> decimal -> octal

        int decimal = 0, i = 0;
        while(binary != 0){
            int rem = (int)(binary % 10);
            decimal = decimal + rem * (int) Math.pow(2, i);
            binary = binary / 10;
            i++;
        }

        int octal = 0, j = 1;
        while(decimal != 0){
            int rem = decimal % 8;
            octal = octal + rem * j;
            decimal = decimal / 8;

            j *= 10;
        }

        return octal;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary Number : ");
        long binary = sc.nextLong();

        System.out.println("Octal Number of " + binary + " is : " + findOctal(binary));

    }

}
