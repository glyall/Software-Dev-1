package homework1;
import java.util.*;

public class sixThree{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer for the n pentagonal numbers you want displayed: ");
    int pent = input.nextInt();
    
    for (int n = 1; n <= pent; n++){
      System.out.println(getPentagonalNumber(n));
    }
}
    
  public static int getPentagonalNumber(int n){
    return n * ( 3 * n - 1) / 2;
    
    }
}