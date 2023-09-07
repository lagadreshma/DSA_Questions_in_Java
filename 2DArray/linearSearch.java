package TwoDArrays;
import java.util.Scanner;

public class linearSearch {

    public static void searchElement(int arr[][], int r, int c, int key){

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == key){
                    System.out.print(key + " is found at position : (" + i + " , " + j + " ) ");
                }
            }
        }

    }

    public static void printArray(int arr[][], int r, int c){

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns of an Array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter Elements of an Array : ");
        for(int i =  0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Element to Search : ");
        int key = sc.nextInt();

        printArray(arr, r,c);
        System.out.println();
        searchElement(arr,r,c,key);

    }

}
