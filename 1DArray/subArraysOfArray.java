package Arrays;
import java.util.Scanner;

public class subArraysOfArray {

    public static int printSubArraysOfArray(int arr[], int n){

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }

        return count;

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

        System.out.println("Total Subarrays of an Array : " + printSubArraysOfArray(arr,n));


    }


}
