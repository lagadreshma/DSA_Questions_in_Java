package Basic.NumberConversion;
import java.util.*;

public class octalToBinary {

    public static long findBinary(int octal){

        // octal -> decimal -> binary

        int decimal = 0, i = 0;
        while(octal != 0){
            int rem = octal % 10;
            decimal = decimal + rem * (int) Math.pow(8, i);
            octal = octal / 10;
            i++;
        }

        long binary = 0, j = 1;
        while(decimal != 0){
            int rem = decimal % 2;
            binary = binary + rem * j;
            decimal = decimal / 2;

            j *= 10;
        }

        return binary;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Octal Number : ");
        int octal = sc.nextInt();

        System.out.println("Binary Number of " + octal + " is : " + findBinary(octal));

    }

}
