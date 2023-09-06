package Pattern;
import java.util.Scanner;

public class solidRhombus {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of Rhombus : ");
        int n = sc.nextInt();

        //    * * * * *
        //   * * * * *
        //  * * * * *
        // * * * * *
        //* * * * *

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        for(int i = n; i >= 1; i--){
//            for(int j = 1; j <= (n - i); j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }

}
