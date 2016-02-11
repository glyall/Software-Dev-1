//Chapter 7 
//Question 2
package homework1;
import java.util.*;
public class HeadsOrTails {
	 public static void main(String[] args) { 
		Scanner Input = new Scanner(System.in);
		System.out.println("Please input a string");
		int x = Input.nextInt();		 
		int [] [] L =IntArray(DecimalToBinary(x));
	 	for(int D =0; D< 3; D ++ ){
	 		for(int S = 0; S <3; S ++){
	 		 if (L[D][S] == 0){
	 			System.out.print(" H "); 
	 		 }else{
	 			 System.out.print(" T ");
	 		}
	 		} 
	 	System.out.println(" ");
	 	}
	 }
   public static  int [] DecimalToBinary (int G){
	   int [] Binary = new int [9];
	   if( G > 511){
		   System.out.println("error");
	   }if ( G >= 256){
		   Binary [0] = 1;
		   G = G-256;
	   }if (G>=128){
		   Binary[1] = 1;
		   G= G-128;
	   } if (G>=64){
		   Binary[2] = 1;
		   G = G-64;
	   }if (G>=32){
		   Binary[3] = 1;
		   G = G-32;
	   }if (G>=16){
		   Binary[4] = 1;
		   G = G-16;
	   }if (G>=8){
		   Binary[5] = 1;
		   G = G-8;
	   }if (G>=4){
		   Binary[6] = 1;
		   G = G-4;
	   }if (G>=2){
		   Binary[7] = 1;
		   G = G-2;
	   }if(G>=1){  
		   Binary[8] = 1;
		   G = G-1;
	   }
	   return Binary;
}
    public static int [] [] IntArray (int [] H){
      int [] [] J =  new int [3] [3];
      int F=0;
	    for(int D =0; D< 3; D ++ ){
		  for (int S = 0; S <3; S ++ ){
			  J[D][S] = H[F];
			  F++;
		  }
		  
	    }
	    return J;
 }
}
