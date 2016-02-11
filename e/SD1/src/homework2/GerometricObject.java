package homework2;

import java.util.Scanner;
abstract class GerometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
    protected GeometricObject(){
    	
    }
    protected  GeometricObject(String color, boolean filled){
      dateCreated = new java.util.Date();
      this.color= color;
      this.filled= filled;
    	
    	
    }




}