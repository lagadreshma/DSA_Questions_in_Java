package TwoDArrays;
import java.util.Scanner;

public class diagonalSum {

    public static void diagonalAddition(int arr[][]){

        int r = arr.length;
        int c = arr[0].length;
        int sum = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i == j){
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonals = " + sum);

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

        diagonalAddition(arr);


    }

}
