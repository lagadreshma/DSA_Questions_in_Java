package Basic.NumberConversion;
import java.util.Scanner;

public class decimalToHexadecimal {

    public static void toHexadecimal(int decimal){

        int i = 0;
        char hexadecimal[] = new char[20];
        while(decimal != 0){
            int rem = decimal % 16;
            if(rem < 10){
                rem = rem + 48;
            }else{
                rem = rem + 55;
            }
            hexadecimal[i] = (char)rem;
            decimal = decimal / 16;
            i++;
        }

        for(i = i - 1; i >= 0; i--){
            System.out.print(hexadecimal[i]);
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        int decimal = sc.nextInt();

        toHexadecimal(decimal);

    }

}
