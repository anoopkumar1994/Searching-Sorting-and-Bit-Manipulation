/*
 * Q3 : Given a number. Using bit manipulation, check whether it is odd or even.
        Input 8, Even
        3, False
 */
import java.util.Scanner;
public class Q3 {
    public static void bitManipulation(int num) {

        if((num & 1) == 0)
        System.out.println("Even");
        else
        System.out.println("Odd");
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();

        bitManipulation(num);
    }
}
