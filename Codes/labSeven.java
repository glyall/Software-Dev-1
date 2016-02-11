import java.io.*;
import java.util.Scanner;
import java.math.*;
public class labSeven {
  
  
  public static void main(String[] args) { 
    Scanner usrInput = new Scanner(System.in);
    int[] myList = new int [usrInput.nextInt()];
    System.out.println("The size is " + myList.length);
    for (int idx = 0; idx < myList.length; idx++)
      myList[idx]= usrInput.nextInt();
   
   double theAverage =0.0;
   for (int idx =0; idx < myList.length; idx++) 
     theAverage += myList[idx];
     theAverage /= myList.length;
     System.out.printf("The average is %f" , theAverage);
      
  int theNumAbove = getNumbAbove(theAverage, myList);
  System.out.printf("The amount of numbers above the 
                      "average is ; d%\n"+, theNumAbove);
  }
    
  public static int getNumAbove(double theAverage, int[] myList){
   int theNumAbove = 0;
   for (int idx = 0; idx <myList.length; idx++){
    if (myList[idx]> theAverage)
      theNumAbove ++;
     
   }
   return theNumAbove; 
    
  }
    
  }


