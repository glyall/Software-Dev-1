import java.util.Scanner;
//import java.math
public class SortedNumbers {
  
  
  public static void main(String[] args) { 
   System.out.println("Please enter  '3' Number");
    Scanner input = new Scanner(System.in);
   double num1 = input.nextDouble() ;
   double num2 = input.nextDouble() ;
   double num3 = input.nextDouble() ;
   displaySortedNumbers (num1,num2,num3);
  }
  public static void displaySortedNumbers(double num1, double num2 , double num3){
    if (num1 < num2 && num1< num3){
      System.out.println( num1 );  
    }else if (num2 < num3 && num2< num1){
      System.out.println( num2 );
    }else{
     System.out.println( num3 ); 
    }  
    if((num2 < num1 && num2 > num3) || (num2 > num1 && num2< num3)){
     System.out.println(num2); 
    } 
    
    
    if(num3> num1 && num3 < num2 || num3 < num1 && num3 > num2){
     System.out.println(num3); 
    }

  }
  
}
