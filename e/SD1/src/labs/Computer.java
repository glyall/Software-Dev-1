package labs;

class Computer {
	 private double Price= 0.0; // Example Listed Price : $8999
	 private String Brand = ""; //Example Brand
	 private double Discount =0; // Example 10% || 20%
	 
	 Computer(){	 
	 }
	 Computer(double P, String B , double C){	 
		 this.Price= P;
		 this.Brand=B;
		 this.Discount=C;
	 }
	 public double getDiscountedPrice(){
		 return Price-Discount;
	 }
	 public double getDiscountedPrice(Computer A){
		 return A.Price-A.Discount;
	 }
}