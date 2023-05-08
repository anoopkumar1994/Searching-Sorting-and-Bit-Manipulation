/*
 * Q4. Given a number, count the number of set bits in that number without using an extra space.
        Note : bit ‘1’ is also known as set bit.
 */
import java.util.*;
public class Q4 {
       public static int coutnBits(int num) {
         int count = 0;
         while(num != 0){
              num &= num -1;
              count++;
         }
          return count;
       }
  public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       System.out.println("Enter a number : ");
       int num = s.nextInt();
       
      System.out.println(coutnBits(num));
  }
    
}
