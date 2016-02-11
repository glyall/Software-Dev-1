import java.io.*;
import java.util.Scanner;
import java.math.*;
public class Palindrome_numbers{
  public static void main(String[] args){
  Scanner user_input = new Scanner (System.in);  
  System.out.println("Please enter a number.");
  int user_number = user_input.nextInt ();
  if(user_number < 0 ) {
   user_number = (user_number * -1)   ;} 
  boolean isPalindrome = true; 
   int div = 1;
   while (user_number / div >= 10) {
   div *= 10;
   }while (user_number != 0) {
   int left = user_number / div;
   int right = user_number % 10;
   if (left != right){
     isPalindrome =  false;}
  user_number = (user_number % div) / 10;
   div /= 100;
   }
   System.out.println(isPalindrome) ;
  } 
  }

    
  
