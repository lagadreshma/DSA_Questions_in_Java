package Arrays;
import java.util.Scanner;

public class uniqueElement {


    // time complexity = O(n^2);
    public static int findUniqueElement(int arr[], int n){
        int count;
        for(int i = 0; i < n; i++){
            count = 0;
            for(int j = i + 1; j < n; j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
            }

            if(count == 0){
                return arr[i];
            }

        }

        return -1;

    }

    // optimized Solution
    // time complexity - O(n);

    public static void searchUniqueElement(int arr[], int n){

        int res = arr[0];
        for(int i = 1; i < n; i++){
            res = res ^ arr[i];
        }

        System.out.println("Unique Element : " + res);

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

        System.out.println("Unique Element is : " + findUniqueElement(arr, n));
        searchUniqueElement(arr, n);

    }

}
