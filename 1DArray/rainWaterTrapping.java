package Arrays;
import java.util.Scanner;

public class rainWaterTrapping {

    public static int rainwaterTrap(int arr[], int n){

        // maxLeft Auxillary Array / Helper array
        // maxRight Auxillary Array
        // using loop calculate totalTrappedWater

        int maxLeft[] = new int[n];
        maxLeft[0] = arr[0];

        for(int i = 1; i < n; i++){
            maxLeft[i] = Math.max(arr[i], maxLeft[i - 1]);
        }

        int maxRight[] = new int[n];
        maxRight[n - 1] = arr[n - 1];

        for(int i = n - 2; i >= 0; i--){
            maxRight[i] = Math.max(arr[i], maxRight[i + 1]);
        }

        int waterLevel, trappedWater, totalTrappedWater = 0;
        for(int i = 0; i < n; i++){
            waterLevel = Math.min(maxLeft[i], maxRight[i]);
            trappedWater = waterLevel - arr[i];
            totalTrappedWater += trappedWater;
        }

        return totalTrappedWater;

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

        System.out.println("Total Trapped RainWater : " + rainwaterTrap(arr, n));

    }

}
