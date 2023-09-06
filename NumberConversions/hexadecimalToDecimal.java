package Basic.NumberConversion;
import java.util.*;

public class hexadecimalToDecimal {

    public static void toDecimal(char hexadecimal[]){

        int decimal = 0, i = 0, len = 0, rem;
        while(hexadecimal[i] != '\0'){
            len++;
            i++;
        }
        len--;
        i = 0;

        while(len >= 0){
            rem = hexadecimal[len];

            if(rem >= 48 && rem <= 57){
                rem = rem -48;
            }else if(rem >= 65 && rem <= 70){
                rem = rem -55;
            }else if(rem >= 97 && rem <= 102){
                rem = rem - 87;
            }else{
                System.out.println("Invalid Number.");
            }

            decimal = decimal + rem * (int) Math.pow(16, i);
            len--;
            i++;

        }

        System.out.println("Decimal Number : " + decimal);

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hexadecimal Number : ");
        char hexadecimal[] = new char[9];

        toDecimal(hexadecimal);

    }

}
