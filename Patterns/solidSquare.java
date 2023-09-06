package Pattern;
import java.util.Scanner;

public class solidSquare {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of Square : ");
        int side = sc.nextInt();

        //  * * * *
        //  * * * *
        //  * * * *
        //  * * * *

        for(int i = 1; i <= side; i++){
            for(int j = 1; j <= side; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

}
