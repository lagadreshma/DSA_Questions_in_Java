package Arrays;
import java.util.Scanner;

public class minSubArraySumByPrefixSum {

    public static int minSum(int arr[], int n){

        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int sum;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){

                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if(minSum > sum){
                    minSum = sum;
                }

            }
        }

        return minSum;

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

        System.out.println("Minimum SubArray Sum : " + minSum(arr, n));

    }

}
