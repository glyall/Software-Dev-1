
import java.util.Scanner;
public class Calendar_test {
 public static void main (String[] args) throws java.lang.Exception
 {
  Scanner input = new Scanner (System.in);
  System.out.println("What is the date??");
  int date = input.nextInt();
  System.out.println("How many days have gone by??");
  int pastDays = input.nextInt();
  int realDate= (date + pastDays);
  if(pastDays < 0 || realDate < 0){ 
  System.out.println("ERRROR!!!!!!");
  }else{ 
   int workingDate= realDate %7;
  switch(workingDate){
  case 0: System.out.println ("Sunday");
   break;
  case 1: System.out.println ("Monday");
   break;
  case 2:System.out.println ("Tuesday");
   break;
  case 3:System.out.println ("Wednesday");
   break;
  case 4:System.out.println("Thursday");
   break;
  case 5:System.out.println ("Friday");
   break;
  case 6:System.out.println("Saturday");
   break;
  } 
  input.close() ;
  }
  
 }
 
}