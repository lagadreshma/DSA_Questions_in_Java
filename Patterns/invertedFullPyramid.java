package Pattern;
import java.util.Scanner;

public class invertedFullPyramid {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n : ");
        int n = sc.nextInt();

        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();

        //  * * * * * * *
        //    * * * * *
        //      * * *
        //        *

        for(int i = n; i >= 1; i--){

            for(int j = 1; j <= (n - i); j++){
                System.out.print("   ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }

            for(int j = 2; j <= i; j++){
                System.out.print(" * ");
            }

            System.out.println();

        }

        System.out.println();

        // 5 5 5 5 5
        //  5 5 5
        //    5

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(n);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(n);
            }

            System.out.println();
        }

        System.out.println();

        //  5 5 5 5 5 5 5 5 5
        //    4 4 4 4 4 4 4
        //      3 3 3 3 3
        //        2 2 2
        //          1

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(i);
            }

            System.out.println();
        }


        System.out.println();

        // A A A A A A A
        //   A A A A A
        //     A A A
        //       A

        char ch = 'A';
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= (n - i); j++){
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(ch + "  ");
            }
            for(int j = 2; j <= i; j++){
                System.out.print(ch + "  ");
            }

            System.out.println();
            ch++;
        }


    }

}
