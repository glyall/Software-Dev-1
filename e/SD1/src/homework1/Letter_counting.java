// Chapter 6 
//Question 6
package homework1;
import java.util.Scanner;
public class Letter_counting {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a String!!!!!");
	String x = input.nextLine();
	System.out.print("The count is " +countLetters(x));

	}
	public static  int countLetters(String s){
       int count = 0;
	         char c;  
	         for (int i = 0; i < s.length() - 1; i++) {  
	             c = s.charAt(i);  
	             if (Character.isLetter(c)) {          
	             count ++ ; 
	             }   
	         }
             return count;
	}
}