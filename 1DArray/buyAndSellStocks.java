package Arrays;
import java.util.Scanner;

public class buyAndSellStocks {

    public static int buyAndSellProfit(int arr[], int n){

        int profit = 0;
        int buy = arr[0];

        for(int i = 0; i < n; i++){
            if(buy < arr[i]){
                profit = Math.max(arr[i] - buy, profit);
            }else{
                buy = arr[i];
            }
        }

        return profit;

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

        System.out.println("Profit : " + buyAndSellProfit(arr, n));

    }

}
