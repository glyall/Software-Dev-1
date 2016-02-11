import java.io.*;
import java.util.Scanner;
import java.math.*;
public class areaOfaHexagon{
    public static void main(String[] args) {
      
      Scanner input = new Scanner (System.in);
      
       System.out.println("Enter the side of the Hexagon");
       double side = input.nextDouble();
       
       float area = (float) (((6 * side) / 4 * Math.tan(Math.PI / 6)));   
      
       System.out.println("The area of the Hexagon is" + area);
    }    
}