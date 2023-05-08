/*
    Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.

    Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
    Output 1: 6

    Input 2: arr = [ 0 0 0 0 0 1 1]
    Output 2: 2
 */

 import java.util.Arrays;
import java.util.Scanner;
public class Q3 {
    public static int countOnes(int arr[]) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
                return arr.length - mid;
            } 
            else if (arr[mid] == 0) {
                low = mid + 1;
            }
             else {
                high = mid - 1;
            }
        }
        return 0;
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
    int result = countOnes(arr);

        System.out.println("One's Occure  " + result + "  times"); 
    }
}
