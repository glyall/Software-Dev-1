/** 
 * File: Lab 6 
 * Author: Gregory Lyall 
 * course CMPT-220
 * Assignment: lab 6 
 * due date September 23,2015
 * Verison 1.0 
 * This program takes seven variables and prints their results 
 *
 */ 
import java.io,*;  //explain why.... 


public class labSix{ 
  public static  void main(String [] args) {
    
  double years =0.0;  
  double months =0.0;
  double weeks =0.0;
  double days  =0.0;
  double hours =0.0;
  double mins  =0.0;
  double secs  =0.0;
  
  
//call method to print results
  //This method calls all of the doubles that are in the class Labsix 
 printResults(years,months,weeks,days,hours,mins,sec)
 
  
 }
/**  
 * printResults
 * 
 * This method prints the results for lab four and five in a single separeted funtions
 * 
 * Parameters:
 * years: The years it will take to hack. 
 * weeks: The weeks it will take to hack. 
 * days: The days it will take to hack. 
 * hours: The hours it will take to hack. 
 * .............
 * return value 
 *  There are no returns vales the function is void
 * 
 */
  public static void  printResults( double Years, double months, double weeks, 
   double days, double hours  , double mins , double sec){
   System.out.printf("It wil take you");
  System.out.printf("%.of year" ,Years);
  System.out.printf("%.of weeks",weeks);
  System.out.printf("%.of days" ,days );
  System.out.printf("%.of hours",hours);
  System.out.printf("%.of mins" ,mins);
  System.out.printf("%.of sec" ,secs);
  System.out.printf("to hack the system. ");
  if(years>1.0) {
    System.out.println("Dude with all due respect, just give up");
  }
  }