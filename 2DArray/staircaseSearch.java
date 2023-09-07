package TwoDArrays;
import java.util.Scanner;

public class staircaseSearch {

    public static void staircaseSearching(int arr[][], int key){

        int r = arr.length;
        int c = arr[0].length;

        int i = r - 1;
        int j = 0;

        while(i >= 0  && j <= (c - 1)){

            if(arr[i][j] == key){
                System.out.println(key + " is Found at position : (" + i + " , " + j + ")");
                return;
            }else if(arr[i][j] > key){
                i--;
            }else if(arr[i][j] < key){
                j++;
            }

        }

        System.out.println(key + " is Not Found.");

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows of an Array : ");
        int r = sc.nextInt();
        System.out.println("Enter Columns of an Array : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Element to Search : ");
        int key = sc.nextInt();

        staircaseSearching(arr,key);

    }

}
