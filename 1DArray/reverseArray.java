package Arrays;
import java.util.Scanner;

public class reverseArray {

    public static void reverseArray(int arr[], int n){

        int s = 0, e = n - 1;

        while(s <= e){

            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;

        }

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

        reverseArray(arr, n);
        printArray(arr, n);

    }

}
