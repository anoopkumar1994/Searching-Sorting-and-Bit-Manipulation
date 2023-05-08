/*
 * Q4. Find out how many pass would be required to sort the following array in decreasing order
    using bubble sort
    Input Array {3,5,1,6,0}  
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

    public static int passCount(int arr[]) {
        int n = arr.length;
        int passCount = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            passCount++;
        }
        return passCount;
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
