package homework1;
import java.util.*;
public class sixFour{
  public static void main(String[] Args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    long n = input.nextLong();
     int sum = sumDigits(n);
    System.out.println("The sum is: " + sum);
  }
   
    public static int sumDigits(long n){
     int num = (int) (n);
     int sum = 0;
     
     while (num >= 0){
       sum += num % 10;
       num = num / 10;
     }
     return sum ;
  } 
}