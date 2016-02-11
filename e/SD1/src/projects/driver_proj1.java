/**
 * file: driver_proj1
 * author: Gregory Lyall
 * course: CMPT 220
 * assignment: Project 1 driver
 * due date: October 14th, 2015 
 * version: 2.0
 */
package projects;

  import java.util.Scanner;
  import java.io.*;
  import java.math.*;
  // This is the class for my driver 
  public class driver_proj1 {
 
  public static void main(String[] args) {
	 Scanner scanFile = new Scanner(System.in);
    // these are variables for the arraay 
	 int a = scanFile.nextInt();
     int b = scanFile.nextInt();
     //These are the double that grab the lenght of the array
     double [] vector1 = new double[a];
     double [] vector2 = new double[b];
    
     for (int i = 0; i <  a; i ++){
       vector1[i]=scanFile.nextDouble();
     }	
       for (int i = 0; i <  b; i ++){
         vector2[i]=scanFile.nextDouble();  
     }
     // This is the method that prints the result from the loop
     double [] prntResult = convolveVectors(vector1,vector2);
     for (int i = 0; i <  prntResult.length; i ++){
       if ( i == prntResult.length-1){
         System.out.printf("%d", Math.round(prntResult[i]));
       }else{
         System.out.printf("%d ", Math.round(prntResult[i]));
      }
    }
      System.out.printf("\n"); 
  }
  
    // this runs the array though a loop until it has come to the right conclusion	
    public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    for (int i = 0; i <  vResult.length; i ++){
    	vResult[i]=0 ;
    	for (int o = 0; o < vSecond.length; o ++){	
    		if((i-o)>= 0 && (i-o) < vFirst.length){
    		vResult[i] += vFirst[i- o] * vSecond[o];	
    	}
      }
    }
    return vResult;  
  }

 }