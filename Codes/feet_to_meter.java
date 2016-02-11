import java.util.Scanner;
class feet_to_meter{
 public static void main (String[] args){
  Scanner  input= new Scanner(System.in);
  
  System.out.println ( " How many feet?? ");
  double user = input.nextDouble();
  double meters = user * 0.3048 ;
  System.out.println (user + " feet converts to " + meters + " meters ");
 }
}