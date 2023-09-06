package Arrays;
import java.util.Scanner;

public class kadanesAlgorithm {

    public static int maxSumBykadane(int arr[], int n){

        // Kadane's Algorithm - if currSum of subarray is negative then it set as zero.

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){

            currSum = currSum + arr[i];

            if(currSum < 0){
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);

        }

        return maxSum;

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

        System.out.println("Maximum SubArray Sum : " + maxSumBykadane(arr, n));

    }

}
