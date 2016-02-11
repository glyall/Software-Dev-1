
import java.util.Scanner;
public class Letter_ {
 public static void main (String[] args) throws java.lang.Exception
 {
   Scanner input = new Scanner (System.in);
   System.out.println("Please enter a String");
    String answer = input.nextLine (); 
    System.out.println("The lenght of the string you entered was  " + answer.length() + " The first letter was " 
    + answer.charAt(0) );
    
 }
}