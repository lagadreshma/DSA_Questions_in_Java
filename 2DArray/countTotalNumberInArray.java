package TwoDArrays;
import java.util.Scanner;

public class countTotalNumberInArray {

    public static int countElements(int arr[][]){

        int r = arr.length;
        int c = arr[0].length;
        int cnt = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                cnt++;
            }
        }

        return cnt;

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

        System.out.println("Total No of Rows : " + arr.length);
        System.out.println("Total No of Cols : " + arr[0].length);

        System.out.println("Total Elements = " + countElements(arr));
    }

}
