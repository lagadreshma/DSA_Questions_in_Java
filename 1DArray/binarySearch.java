package Arrays;
import java.util.Scanner;

public class binarySearch {

    public static int BinarySearch(int arr[], int n, int key){

        int s = 0, e = n - 1, mid;

        while(s < e){

            mid = s + (e - s) / 2;

            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){
                e = mid - 1;
            }else{
                s = mid + 1;
            }

        }

        return -1;

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

        System.out.println("Enter Element for Searching in an Array : ");
        int key = sc.nextInt();

        System.out.println(key + " is Found at index : " + BinarySearch(arr,n,key));

    }

}
