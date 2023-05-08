/*
 * Q5. Find out the number of iterations to sort the array in descending order using selection sort.
    Input Array {3,5,1,6,0}
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

    public static int passCount(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
            count++;
        }
        return count;
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

        int count = passCount(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Total count : " + count);


    }
    
}
