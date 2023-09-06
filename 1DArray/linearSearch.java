package Arrays;
import java.util.Scanner;

public class linearSearch {

    public static int searchElement(int arr[], int key){

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == key){
                return i;
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

        System.out.println("Enter element for Searching : ");
        int key = sc.nextInt();

        int index = searchElement(arr,key);
        if(index == -1){
            System.out.println(key + " is Not Present.");
        }else{
            System.out.println(key + " is Present at index : " + index);
        }

    }

}
