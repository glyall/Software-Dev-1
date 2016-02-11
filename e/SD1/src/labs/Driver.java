package labs;

public class Driver {
	public static void main(String[] args) { 
      Desktop Greg = new Desktop ("Samsung","ATX",3.4," Crosair ");
      System.out.println(Greg.getmonitorBrand()+" is the Moniter Brand. " + Greg.gettowerType()+ " is the Case Type." +" "+Greg.getcPUSpeed()+" Ghz is the speed of the Processor. "+
    		  Greg.gettowerBrand()+" is the Case manufacturer"+" "+Greg.getDiscountedPrice());
      System.out.print("");
      Laptop Riley = new Laptop (100.0, "Lenovo" ,13.0);
      System.out.println(Riley.getCharger()+" Watts "+ Riley.getCompany()+" "+
      		  Riley.getSize()+" inches"+" "+Riley.getDiscountedPrice(Greg));

	




}
}




/*Computer Shellie = new Computer(399.99 , "Dell" , 15.0);
	System.out.println(Shellie.getDiscountedPrice());
	*/
	
/*Laptop Greg = new Laptop (100.0, "Lenovo" ,13.0);
System.out.println(Greg.getCharger()+" Watts "+ Greg.getCompany()+" "+
		  Greg.getSize()+" inches");
		  */
