package Arrays;
import java.util.Scanner;

public class kadanesAlgorithmForNegativeArray {

    // Kadane's Algorithm - to find Maximum Sum of Subarray , if Currsum is negative then it set to as Zero.
    // It add the continously array, It is Dynamic Approach to find Maximum Sum of Subarray;


    // Note - In Case, All Negative elements of an Array Kadanes Algorithm return Zero.
    // so for that, we have to add One condition.

    public static int maxSumBykadane(int arr[], int n){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                cnt++;
            }
        }

        if(cnt == n){

            for(int i = 0; i < n; i++){
                maxSum = Math.max(arr[i], maxSum);
            }

        }else{

            for(int i = 0; i < n; i++){

                currSum += arr[i];
                if(currSum < 0){
                    currSum = 0;
                }

                maxSum = Math.max(currSum, maxSum);

            }

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
