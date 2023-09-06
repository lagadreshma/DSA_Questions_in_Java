package Arrays;
import java.util.Scanner;

public class reverseAlternateArrayElements {

    public static void alternateElements(int arr[], int n){

        for(int i = 0; i < n- 1; i+= 2){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

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

        alternateElements(arr, n);
        printArray(arr, n);

    }

}
