package Arrays;
import java.util.Scanner;

public class prefixSumOfArray {

    public static void prefixSumArray(int arr[], int n){

        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        printPrefixArray(prefix,n);

    }

    public static void printPrefixArray(int arr[], int n){

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int n = sc.nextInt();

        int arr[] = new int[10];
        System.out.println("Enter Elements of an Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        prefixSumArray(arr, n);

    }

}
