//Chapter 9 
//Question 1 (part 1)
package homework1;
import java.util.*;

public class Rectangle {
	double width = 1; 
	double height =1;
 Rectangle(){};
 Rectangle (double width, double height){
	 this.width =width ;
	 this.height = height;
 }
 public   double getArea (){
	 return (this.width*this.height);
	 
	 
 }
 public double getPerimeter(){
	 return ((this.width*2) +(this.height*2)) ;
	 
 }
 
 };

