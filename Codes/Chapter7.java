import java.util.Scanner; 
import java.util.Arrays;

public class Chapter7 { 
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
    // GOing throught the array and changes the string to a int   
    for (int x = 0; x < numbstudents; x++) {
         nextgrade = Integer.parseInt(user.next());
         gradesArray[x] = nextgrade;
       } 
    OrderGrades(gradesArray);
  }
  
  public static void OrderGrades( int[] grades) {
    
    int max = grades[0];
    int[] sortedGradesArray = new int[grades.length];
    Arrays.sort(grades);
    for (int y = 0; y < grades.length; y++) {
    System.out.println( "Student  scored a " + 4grades[y]);
    }  
  } 
  }

