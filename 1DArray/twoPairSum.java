package Arrays;
import java.util.Scanner;

public class twoPairSum {

    public static void pairSum(int arr[], int n, int sum){

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((arr[i] + arr[j]) == sum){
                    System.out.print(arr[i]  + " , " + arr[j]);
                }
            }

            System.out.println();

        }

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

        System.out.println("Enter Two Pair sum K = ");
        int k = sc.nextInt();

        pairSum(arr, n, k);

    }

}
