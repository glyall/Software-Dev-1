// Chapter 8 
// Question 1 
package homework1;
import java.util.*;
import java.util.Scanner;

public class TheMajorDiangonal {
	public static void main(String[] args){
    System.out.println("Enter Demension n of nxn matrix");
    Scanner input = new Scanner (System.in);
    int N = input.nextInt();
    double [] [] Greg = new double  [N] [N]; 
    for(int A =0; A < Greg.length; A ++ ){
	System.out.println("Enter row:");
    	for (int S = 0; S < Greg[A].length; S ++ ){
		  Greg [A] [S] = input.nextDouble();  
		  }
	}System.out.print(sumMajorDiagonal(Greg));
	}
public static double sumMajorDiagonal(double [] [] M){
	 double D =0;
	 for(int A =0; A< M.length; A ++ ){
		  for (int S = 0; S < M[A].length; S ++ ){
		     if(A == S){
			  D= D + M [A][S];
		     }
		  }
	 }	 
	 return D;
}
}
