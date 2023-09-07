package TwoDArrays;
import java.util.Scanner;

public class binarySearch {

    public static void searchElement(int arr[][], int key){

        int r = arr.length;
        int c = arr[0].length;

        int i = 0;
        int j = c - 1;

        while((i <= r - 1) && (j >= 0)){

            if(arr[i][j] == key){
                System.out.println(key + " is Found at position : (" + i + " , " + j + ")");
                return;
            }else if(arr[i][j] > key){
                j--;
            }else if(arr[i][j] < key){
                i++;
            }

        }

        System.out.println(key + " is Not Found.");

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of an Array : ");
        int r = sc.nextInt();
        System.out.println("Enter columns of an Array : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter key element for searching : ");
        int key = sc.nextInt();

        searchElement(arr,key);

    }

}
