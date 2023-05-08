/*
 * Q3. WAP to sort an array in decreasing order using insertion sort

    Input Array {3,5,1,6,0}
    Output Array: {6, 5, 3, 1, 0}

 */

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public static void descendingOrder(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] > arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size :  ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements : ");

        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }

        descendingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}
