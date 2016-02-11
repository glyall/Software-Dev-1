import java.util.Scanner; 
public class Chapter6_1{
  
  
  public static void main(String[] args) { 
    System.out.println("Please enter a string");
    Scanner user = new Scanner(System.in);
    String user_answer = user.nextLine () ; 
    System.out.println("Please Character");
   char first = user.next().charAt(0);
    System.out.println(count(user_answer,first));
  }
  public static int count (String str, char a ) {
   int letter_count = 0 ;
   for (int first_char = 0; first_char < str.length(); first_char ++ ){
   if ( a == str.charAt(first_char)) {
     letter_count ++; 
   }
    }
    return letter_count;
  }
}