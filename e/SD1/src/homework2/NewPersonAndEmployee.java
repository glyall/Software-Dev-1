//Chapter 11 
//Question 2
package homework2;
	import java.util.Scanner;
    import java.util.Date;
	
	public class NewPersonAndEmployee {
      private java.util.Date theDate ;


    class myDate{
	  private double date;
	   Date theDate = new java.util.Date();
	}
    public myDate(double date){
    	this.date = date;
    	this.date =dateOfHire;
    }
    public String getDate(){
    	return date; 
    }
	
  class Person{
    	String name;
    	String address;
    	String phoneNumber;
    	String emailAddress;
    	}
  class Student extends Person{
	  final String name;
	  final String address;
	  final String phoneNumber;
	  final String emailAddress; 
	 }
  class Employee extends Person{
	 
	  int officeNumber;
	  int salary;
	  double dateOfHire;
	  final String name;
	  final String address;
	  final String phoneNumber;
	  final String emailAddress; 
	  }
  class Faculty extends Employee{
  }
  class Staff extends Employee{
  }
}
