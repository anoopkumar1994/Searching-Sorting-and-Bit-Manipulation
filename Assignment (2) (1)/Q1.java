/*
 * Problem 1: given a number, print its binary representation. [easy]
    Input 1: number = 5
    Output 1: 101

    Input 2: number = 10
    Output 2: 1010
 */
import java.util.Scanner;

public class Q1{

    public static void convertBinary(int num) {
        int decimalNum = 0;
        int power = 1;
       
        while(num > 0){
            int digit = num % 2;
            decimalNum += digit * power;
            num /= 2;
            power *= 10;
        }
        System.out.println(decimalNum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int decimal = s.nextInt();

        convertBinary(decimal);
    }
}