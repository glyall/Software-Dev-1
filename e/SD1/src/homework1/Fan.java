//Chapter 9 
//Question 2 (Part 1)
package homework1;

public class Fan {

	final  static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	private int speed =SLOW;
	private boolean on = false;
	private double raduis = 5;
	private String colour =  "blue";
	
	public double getRaduis() {
		return raduis;
	}
	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	Fan(){};
	public String toString(){
	 String life = ("The Speed is " +this.getSpeed( ) + " ,The fan is "+ this.getColour( ) + ", with a Radius of "+ this.getRaduis( ));	
	 if (!this.on){
		life = life + (", fan is off ");
		 
	 } return life;
	};
	
}
