/*
 * Q2. WAP to sort an array in descending order using selection sort
    Input Array {3,5,1,6,0}
    Output Array: {6, 5, 3, 1, 0}

 */

import java.util.*;

public class Q2 {
    public static void descendingOrder(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] > arr[minIndex]){
                    arr[j] = arr[j] - arr[minIndex];
                    arr[minIndex] = arr[j] + arr[minIndex];
                    arr[j] = arr[minIndex] - arr[j];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size : ");
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
