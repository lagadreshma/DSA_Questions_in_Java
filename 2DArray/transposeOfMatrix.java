package TwoDArrays;
import java.util.Scanner;

public class transposeOfMatrix {

    public static void transposeArray(int arr[][]){

        int r = arr.length;
        int c = arr[0].length;

        System.out.println("Transpose Array : ");
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void printArray(int arr[][]){

        int r = arr.length;
        int c = arr[0].length;

        System.out.println("Original Array : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

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

        transposeArray(arr);
        printArray(arr);

    }

}
