/*
    Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
    A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer 
    with itself.

    Example 1:
    Input: num = 16
    Output: true
    Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

    Example 2:
    Input: num = 14
    Output: false
    Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 */

import java.util.Scanner;

public class Q5 {

    public static boolean squreRoot(int num) {
        int low = 1, high = num;
   

        while(low <= high){
            int mid = low + (high - low)/2;
            long multi =  mid * mid;
        
            if(multi == num){
                return true;
            }
            else if(multi < num){
                low = mid +1;
            }
            else{   
                high = mid -1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num = s.nextInt();

        boolean result = squreRoot(num);
        System.out.println(result);
    }
}
