package TwoDArrays;
import java.util.Scanner;

public class columnWiseSum {

    public static void columnSum(int arr[][]){

        int r = arr.length;
        int c = arr[0].length;
        int sum;

        for(int i = 0; i < c; i++){
            sum = 0;
            for(int j = 0; j < r; j++){
                sum = sum + arr[j][i];
            }
            System.out.println("Sum of " + i + "th column is : " + sum);
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of an Array : ");
        int r = sc.nextInt();
        System.out.println("Enter columns of an Array : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        columnSum(arr);

    }

}
