package Arrays;
import java.util.Scanner;

public class calculateMaximumSumOfSubarray {

    public static int calculateMaxSum(int arr[], int n){

        int sum;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){

            for(int j = i; j < n; j++){

                sum = 0;

                for(int k = i; k <= j; k++){

                    sum = sum + arr[k];
                    if(maxSum < sum){
                        maxSum = sum;
                    }

                }

            }

        }

        return maxSum;

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

        System.out.println("Maximum Sum of Subarray is : " + calculateMaxSum(arr,n));


    }


}
