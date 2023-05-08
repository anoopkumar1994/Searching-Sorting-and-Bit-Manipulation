/*
    Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even 
    number of times except one which appears an odd number of times. Find that odd appearing 
    element in linear time and without using any extra memory.
    For example,
    Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
    Output : The odd occurring element is 4.
 */

import java.util.Scanner;

public class Q5 {

    public static int dupOccOddEven(int arr[]) {
        int result = 0;
        for(int i = 0; i<arr.length; i++){
           result ^= arr[i];
        }
        return result;
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

       int result = dupOccOddEven(arr);
       System.out.println(result);
    }
}
