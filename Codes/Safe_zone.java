import java.io.*;
import java.util.Scanner;
import java.math.*;
public class Safe_zone{
  public static void main(String[] args){
     Scanner user_input = new Scanner (System.in);
    System.out.println("what is x??");
    int user_x = user_input.nextInt( );
    System.out.println("what is y??");
    int user_y = user_input.nextInt( );
    if (user_x >= 200 && user_y >=100 ){
      System.out.println ("Your not in the Safe Zone!!!"); 
    }if(user_x<=0 && user_y<= 0){
        System.out.println (" You are not in the safe zone!!!");  
    } 
    //y_axis
    float y_axis = 100 - user_y; 
    // x_axis
    float x_axis =(y_axis / 100) * 200;
    if(user_x <= x_axis){
    //check variables to see if they fall in safe zone
    System.out.println ("you made it!!!!");
    }else{ 
        System.out.println ("where are you????"); 
    }
  }
}