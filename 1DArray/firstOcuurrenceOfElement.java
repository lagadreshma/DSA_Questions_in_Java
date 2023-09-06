package Arrays;
import java.util.Scanner;

public class firstOcuurrenceOfElement {

    public static int findFirstOcc(int arr[], int n, int element){

        int s = 0, e = n - 1;
        int mid, ans = -1;

        while(s <= e){

            mid = s + (e - s) / 2;

            if(arr[mid] == element){
                ans = mid;
                e = mid - 1;
            }else if(arr[mid] > element){
                e = mid - 1;
            }else if(arr[mid] < element){
                s = mid + 1;
            }

        }

        return ans;

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

        System.out.println("Enter Element to find its first occurrence : ");
        int element = sc.nextInt();

        System.out.println("First Occurrence of " + element + " is at position : " + findFirstOcc(arr, n, element));

    }

}
