package Arrays;
import java.util.Scanner;

public class triplets {

    public static void findTriplets(int arr[], int n, int sum){

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        System.out.print(arr[i] + " , " + arr[j] + " , " + arr[k]);
                    }
                }
                System.out.println();
            }
        }

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

        System.out.println("Enter Triplet Sum k : ");
        int k = sc.nextInt();

        findTriplets(arr,n, k);

    }

}
