package Arrays;
import java.util.Scanner;

public class maxRightAuxillaryArray {

    public static void maxRightArray(int arr[], int n){

        int maxRight[] = new int[n];
        maxRight[n - 1] = arr[n - 1];

        for(int i = n - 2; i >= 0; i--){
            maxRight[i] = Math.max(arr[i], maxRight[i + 1]);
        }

        printArray(maxRight, n);

    }

    public static void printArray(int arr[], int n){

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int n = sc.nextInt();

        int arr[] = new int[10];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        maxRightArray(arr, n);

    }

}
