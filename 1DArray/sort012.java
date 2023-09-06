package Arrays;
import java.util.Scanner;

public class sort012 {

    public static void sortZeroOneTwo(int arr[], int n){

        int s = 0, mid = 0, e = n - 1;

        while(mid <= e){

            int temp;

            switch(arr[mid]){

                case 0: temp = arr[mid];
                        arr[mid] = arr[s];
                        arr[s] = temp;
                        s++;
                        mid++;
                        break;

                case 1: mid++;
                        break;

                case 2: temp = arr[mid];
                        arr[mid] = arr[e];
                        arr[e] = temp;
                        e--;
                        break;

            }

        }

    }

    public static void printArray(int arr[], int n){

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

        sortZeroOneTwo(arr,n);
        printArray(arr,n);

    }

}
