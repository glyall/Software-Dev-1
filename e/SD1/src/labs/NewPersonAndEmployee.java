package labs;

public class NewPersonAndEmployee {
	public static void main(String[] args) {
	


  public class Person{
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;
    Person(){
    }
  }
     class Students extends Person{
  	 final String status;
  	 Students(){
  	 }
  	 public String toString(){
  		 String ToReturn =   +name + address +phoneNumber
  		+ emailAddress ;
  		 return ToReturn;
  	 }
     }
  
   class Employee extends Person{
	 private int officerNumber;
	 private int salavry;
	 private MyDate dateHired;
	  Employee(){  
	  }
 }
  class Facullty extends Employee{
	private String officeHours;
	private String rank;
	Facullty(){
	}
 }
  class Staff extends Employee{
	private String title;
    Staff(){	
    }
  }
  
   class MyDate{
	private String date; 
 
   public MyDate(String date){
   this.date = date;
   }
   public String getDate(){
	return date;
}
 }
}
}


