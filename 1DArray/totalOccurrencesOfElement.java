package Arrays;
import java.util.Scanner;

public class totalOccurrencesOfElement {

    public static int findFirstOcc(int arr[], int n, int element){

        int s = 0, e = n - 1;
        int ans = -1, mid;

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

    public static int findLastOcc(int arr[], int n, int element){

        int s = 0, mid, e = n - 1;
        int ans = -1;

        while(s <= e){

            mid = s + (e - s) / 2;

            if(arr[mid] == element){
                ans = mid;
                s = mid + 1;
            }else if(arr[mid] > element){
                e = mid - 1;
            }else if(arr[mid] < element){
                s = mid + 1;
            }

        }

        return ans;

    }

    public static int findTotalOcc(int arr[], int n, int element){

          int first = findFirstOcc(arr, n, element);
          int last = findLastOcc(arr, n, element);

          int total = last - first + 1;

          return total;

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

        System.out.println("Enter Element to find it's Total Occurrences : ");
        int element = sc.nextInt();

        System.out.println("Total Occurrences of " + element + " = " + findTotalOcc(arr, n, element));

    }

}
