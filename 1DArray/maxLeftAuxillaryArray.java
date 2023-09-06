package Arrays;
import java.util.Scanner;

public class maxLeftAuxillaryArray {

    public static void maxLeftArray(int arr[], int n){

        int maxLeft[] = new int[n];
        maxLeft[0] = arr[0];
        for(int i = 1; i < n; i++){
            maxLeft[i] = Math.max(maxLeft[i - 1], arr[i]);
        }

        printArray(maxLeft, n);

    }

    public static void printArray(int arr[], int n){

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

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

        maxLeftArray(arr, n);

    }

}
