//Chapter 6 
//Question 5
package homework1;
import java.util.Scanner;

public class passwordChecker {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter a Password") ;
	String x = input.nextLine();
	if (isValid(x)){
		System.out.println("Gratz");	
		
	}else{
		System.out.println("Not Valid Password");
		
	}
}
	
 public static boolean isValid( String password){
	 if (password.length() < 8) {   
         return false;  
     } else {      
         char c;  
         int count = 1;   
         for (int i = 0; i < password.length() - 1; i++) {  
             c = password.charAt(i);  
             if (!Character.isLetterOrDigit(c)) {          
                 return false;  
             } else if (Character.isDigit(c)) {  
                 count++;  
                 if (count < 2)   {     
                     return false;  
                 }     
             }  
         }  
     }  
     return true;   
 }
}
