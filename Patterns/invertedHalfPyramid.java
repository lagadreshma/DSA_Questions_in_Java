package Pattern;
import java.util.*;

public class invertedHalfPyramid {

    public static void main(String args[]){

        //* * * * *
        //* * * *
        //* * *
        //* *
        //*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n : ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        // A B C D E
        // A B C D
        // A B C
        // A B
        // A

        for(char i = 'E'; i >= 'A'; i--){
            for(char j = 'A'; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
