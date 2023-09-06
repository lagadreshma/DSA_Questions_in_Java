package Pattern;
import java.util.Scanner;

public class charFullPyramid {

    public static void main(String args[]){

        //    A
        //   B B
        //  C C C
        // D D D D
        //E E E E E

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n : ");
        int n = sc.nextInt();
        char ch = 'A';

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }

        System.out.println();

        //       A
        //      B C
        //     D E F
        //    G H I J

        char ch1 = 'A';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(ch1 + " ");
                ch1++;
            }
            System.out.println();
        }

        System.out.println();

        //       A
        //      A B
        //     A B C
        //    A B C D
        //   A B C D E

        for(char i = 'A'; i <= 'E'; i++){
            for(int j = 1; j <= ('E' - i); j++){
                System.out.print(" ");
            }
            for(char j = 'A'; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }

}
