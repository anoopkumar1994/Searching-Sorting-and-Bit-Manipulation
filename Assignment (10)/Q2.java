/*
    Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is 
    not present return -1.

Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
Output 1: 6

Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
Output 2: -1
 */

 import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static int lastOcc(int arr[], int target) {
     int low = 0, hight = arr.length-1, temp = -1;

     while(low <= hight){
        int mid = low + (hight - low)/2;

        if(arr[mid] == target){
            temp = mid;
            low = mid + 1;
        }
        else if(arr[mid] > target){
            hight = mid-1;
        }else{
            low = mid+1;
        }
     }
        return temp;
    }
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the array size : ");
    int size = s.nextInt();
    int arr[] = new int[size];

    System.out.println("Enter the array elemets : ");
    for(int i = 0; i<size; i++){
        arr[i] = s.nextInt();
    }
    
    Arrays.sort(arr);

    System.out.println("Enter target element : ");
    int target = s.nextInt();
    int result = lastOcc(arr, target);

    if(result == -1){
        System.out.println("Element not found in array");
    }else{
        System.out.println("Element found at index " + result);
    }
 }   
}
