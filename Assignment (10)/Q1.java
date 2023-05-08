/*
 *Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element, 
else print “Element not found in array”. Input the size of array, array from user and the element X from user. 
Use Linear Search to find the element.

 */

 import java.util.Scanner;

public class Q1{
    public static int linearSearch(int arr[], int target) {
        int temp = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                temp = i;
                return temp;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the array elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter searching element : ");
        int target = s.nextInt();

        int result = linearSearch(arr, target);

        if(result == -1){
            System.out.println("Element not found in array");
        }else{
            System.out.println("Element found at index " + result);
        }
    }
}