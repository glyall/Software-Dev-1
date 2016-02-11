//Chapter 9 
//Question 1 (part 2)
package homework1;

public class RectangleTest {
	  public static void main(String[] args) { 
	Rectangle G = new Rectangle (4,40); 
	Rectangle F = new Rectangle	(3.5,35.9);	

	
	System.out.println("the area of a " + G.width  + " x " + G.height+  " is " +  G.getArea());
	System.out.println("");
	System.out.println("the perimeter of a " + G.width  + "x" + G.height+  " is " +  G.getPerimeter());
	System.out.println("");
	System.out.println("");
	System.out.println("the area of a " + F.width  + "x" + F.height+  " is " +  F.getArea());
	System.out.println("");
	System.out.println("the perimeter of a " + F.width  + "x" + F.height+  " is " +  F.getPerimeter());
}
}
