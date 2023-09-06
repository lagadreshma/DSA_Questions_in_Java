package Pattern;
import java.util.Scanner;

public class hollowDiamond {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n : ");
        int n = sc.nextInt();

        //        *
        //       * *
        //      *   *
        //     *     *
        //    *       *
        //     *     *
        //      *   *
        //       * *
        //        *

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i == 1) || (j == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= i; j++) {
                if ((i == j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i == 1) || (j == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= i; j++) {
                if ((i == j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}