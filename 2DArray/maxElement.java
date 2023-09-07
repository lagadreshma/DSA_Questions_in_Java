package TwoDArrays;
import java.util.Scanner;

public class maxElement {

    public static int findMaxElement(int arr[][], int r, int c){

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        return max;

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

        System.out.println("Minimum Element = " + findMaxElement(arr,r,c));

    }

}
