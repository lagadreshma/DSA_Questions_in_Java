package Pattern;
import java.util.*;

public class hollowRhombus {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n : ");
        int n = sc.nextInt();

       //        * * * *
        //      *     *
        //     *     *
        //    *     *
        //   * * * *

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if((i == 1) || (j == 1) || (i == n) || (j == n)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
