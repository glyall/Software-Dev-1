//Chapter 9 
//Question 2 (Part 2)
package homework1;

public class FanTest {
	public static void main(String[] args) { 
	Fan G =  new Fan();
    G.setSpeed(Fan.FAST);
    G.setColour("Yellow");
    G.setOn(true);
    G.setRaduis(10);
    
    Fan F = new Fan();
    F.setSpeed(Fan.MEDIUM);
  
    System.out.println(G.toString());
    System.out.println();
    System.out.print(F.toString());
    
}
}