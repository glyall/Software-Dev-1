package homework1;
import java.util.Scanner; 
public class AssignedGrades { 
  public static void main(String[] args) { 
    // variable that holds next grade
    int nextgrade;
  // Setting up the Scanner 
    Scanner user = new Scanner(System.in);
    System.out.println("Enter number of Students"); 
   // saving the intertatger verison of the number of students 
    int numbstudents = Integer.parseInt(user.next());
    System.out.println("Please enter the grades.");
   // Creating an Int arry as large as the number of students 
    int[] gradesArray = new int[numbstudents];
    // Going throught the array and changes the string to a int   
    for (int x = 0; x < numbstudents; x++) {
         nextgrade = Integer.parseInt(user.next());
         gradesArray[x] = nextgrade;
       } 
    OrderGrades(gradesArray);
  }
  public static void OrderGrades( int[] grades) {
    int max = grades[0];
    for (int y = 0; y < grades.length; y++){
      if(grades[y]>max){
    	  max = grades[y];  
      }	  
    };
    for (int y = 0; y < grades.length; y++) {
        String G ;
         if (grades[y] == max){
         G="A";	
         }else if ( grades[y]> (max-10)){
          G="B";	 
         }else if ( grades[y]> (max-20)){
          G="C";
         }else if ( grades[y]> (max-30)){
          G="D";
         }else{
          G="F";	 	 
         }	 
        System.out.println( "Student "+ y +" scored a " + grades[y] +" Which gives them an " + G );
    }  
  } 
 }

