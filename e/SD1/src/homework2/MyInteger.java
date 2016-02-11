/**
 * file: MyInteger
 * author: Gregory Lyall
 * course: CMPT 220
 * assignment: MyInteger (Chapter 10(Question 1))
 * due date: November 3, 2015
 * version: 1.0
 * 
 */
package homework2;
public class MyInteger {
	public int getTheInt() {
		return theInt;
	}
	public void setTheInt(int theInt) {
		this.theInt = theInt;
	}

	private int  theInt;
	MyInteger(int Greg){
		setTheInt(Greg);
	}
	public int getVal(){
		return getTheInt();

	}
    //all of the EVEN
	public boolean isEven(){
		return ((getTheInt() %2) == 0); 
	}
	static boolean isEven(int z){
		return ((z % 2)==0);
	}
	static boolean isEven(MyInteger A){
	    return(A.getTheInt()%2 ==0 );	
	}
    // all of the ODDS
	public boolean isOdd(){
		return ((getTheInt() % 2)!=0);
	}
	static boolean isOdd(int A){
		return ((A % 2)!=0);
	}
	static boolean isOdd(MyInteger B){
		return ((B.getTheInt() % 2)!=0);
	}
	//Is Prime
	static boolean isPrime(int C){
		boolean isPrime = true;
		for ( int B = 2; B <= C ; B++ ){
			if ( C % B== 0) 
				isPrime = false;	
		} 
		return isPrime; 
	}
	public boolean isPrime(){
		boolean isPrime = true;
		for ( int B = 2; B <= getTheInt() ; B++ ){
			if ( getTheInt() % B== 0) 
				isPrime = false;	
		} 
		return isPrime; 
				
	}
	static boolean isPrime(MyInteger H ){
		boolean isPrime = true;
		for ( int B = 2; B <= H.getTheInt() ; B++ ){
			if ( H.getTheInt() % B== 0) 
				isPrime = false;	
		} 
		return isPrime; 
	}
	// All equals functions
	public boolean equals (int J){
		 return J == getTheInt();
		}
	public boolean equals(MyInteger F){
	   return F.getTheInt() == getTheInt();   
   }
	static int parseInt(char [] L){
		int U=0;
		for ( int i = 0; i < L.length; i ++ ){
		 U = U + (L[i]*(L.length-i));
		}
		return U;
	}
	static int parseInt(String K){
		int U=0;
		char[] charArray = K.toCharArray();
		for ( int i = 0; i < charArray.length; i ++ ){
		 U = U + (charArray[i]*(charArray.length-i));
		}
		return U;
	}
}

	








