package Pattern;
import java.util.Scanner;

public class numberFullPyramid {

    public static void main(String args[]){

        //     1
        //    1 2
        //   1 2 3
        //  1 2 3 4
        // 1 2 3 4 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }


        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }


    }

}
