package Arrays;
import java.util.Scanner;

public class rainWaterTrappingOptimized {

    public static int rainwaterTrap(int arr[], int n){

        int l = 0, r = n - 1;
        int lmax = arr[l];
        int rmax = arr[r];
        int res = 0;

        while(l < r){

            if(lmax < rmax){
                l++;
                lmax = Math.max(lmax,arr[l]);
                res += lmax - arr[l];
            }else{
                r--;
                rmax = Math.max(rmax, arr[r]);
                res += rmax - arr[r];
            }

        }

        return res;

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
