/*
 * Problem 2: given a number ‘n’, predict whether it is a power of two or not. [medium]
    Input 1: n = 15
    Output 1: False

    Input 2: n = 32
    Output 2: True
 */
import java.util.*;

public class Q2 {
    public static boolean powerOfTwoOrNot(int num) {
        if(num <= 0){   
            return false;
        }
        while(num > 1){
            if(num % 2 != 0){
                return false;
            }
            num /= 2;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();

        if(num % 2 == 0){
        System.out.println(powerOfTwoOrNot(num));
        }
        else if(num % 2 != 0){
            System.out.println(powerOfTwoOrNot(num));
        }
    }
}
