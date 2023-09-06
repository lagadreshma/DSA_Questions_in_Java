package Arrays;
import java.util.Scanner;

public class findMinimumElement {

   public static int findMin(int arr[]){

       int min = Integer.MAX_VALUE;

       for(int i = 0; i < arr.length; i++){
           if(arr[i] < min){
               min = arr[i];
           }
       }

       return min;

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

        System.out.println("Minimum Element : " + findMin(arr));

    }

}
