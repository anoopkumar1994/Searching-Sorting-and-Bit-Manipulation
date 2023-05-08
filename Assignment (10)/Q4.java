/*
    Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element 
    is not found in the array, report that as well.

Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 5
Output: Target 5 occurs 3 times

Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 6
Output: Target 6 occurs 2 times
 */

 import java.util.Arrays;
import java.util.Scanner;
public class Q4 {
    public static int countOccNum(int arr[], int target) {
        int low = 0, high = arr.length-1, mid = 0, count = 0;

        while(low <= high){
            mid = low + (high - low)/2;

            if(arr[mid] == target){
                low = mid + 1;
                count++;
            }
            else if(arr[mid] > target){
                high = mid -1;
            }
            else{
                low = mid - 1;
            }
        }
        return count;
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

        System.out.println("Enter the number : ");
        int target = s.nextInt();
        int result = countOccNum(arr, target);

        System.out.println("Target  " + target + " occures " +  result + "  times"); 
    }
}
