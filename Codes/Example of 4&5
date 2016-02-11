/**
 * file: labFourAndFive.java
 * author: Pablo Rivas
 * course: CMPT 220
 * assignment: Lab 4 and 5
 * due date: September 16, 2015
 * version: 1.0
 * 
 * This file contains the code for Lab 4 and 5, which finds the time it takes
 * to hack a security system using brute force. User provides encription level
 * and the time it takes her to write a password into a system..
 */

import java.util.Scanner;    // We use the scanner to read user's input from
                             // standard input.

/**
 * labFourAndFive
 * 
 * This class implements the main functionality of the program. 
 */
public class labFourAndFive {

  // Constant to convert milliseconds to seconds
  static final double MSEC_TO_SEC_RATE = 0.001; 

/**
 * main
 *
 * This code asks a hacker user to enter a number for how much time it will
 * take for her to type one character and press [Enter]. Then asks the user for
 * a string corresponding to the units of time, either seconds ('sec') or
 * milliseconds ('msec'). Also, it prompts the user to enter an integer
 * corresponding to the encryption level of the security system in bits. E.g.,
 * 1, 2, 4, etc. With this information, we estimate the time it will take the
 * hacker to find the password using brute force in the worst case scenario.
 * If there is a user input error, this code will display an error message. 
 * 
 * Parameters:
 *   args: The standard arguments. Not used in this lab.
 * 
 * Return value: 
 *   There are no return values. The function is void.
 */
  public static void main(String[] args) {
    Scanner sUserInput = new Scanner(System.in);    // This will take the
                                                    // input from the user

    boolean isCorrectInput = false;    // Variable used to control input
                                       // validation. Initially false.

    // Variable to receive the time it takes a hacker to type one password. It
    // makes sense to be a double instead of an integer.
    double timeToTypeOnePwd = 0.0;

    String timeUnits = "";    // Variable to receive the time unit: sec or msec

    // Variable to store the target enctryption level in bits. It has to be an
    // integer, usually small. A byte type is too small and a short is too big,
    // but there is nothing in between, so we will use a short type. 
    short encryptionLevel = 0;    

    // This variable will hold the total number of seconds it takes to hack. It
    // has to be a really, really, long number. We want an integer here because
    // we will be rounding up if there are fractions anyway. The longest Java
    // can handle as an actual integer is a -long- type. But you will find out
    // that it will not work. An alternative is to use the BigInteger class
    // for integers and BigDecimal for numbers with decimal digits. Both
    // classes are defined in java.math package. However, we can use a double
    // an treat it as an integer, knowing the precision risks involved.
    double secondsItTakesToHack = 0.0; 

    while (isCorrectInput == false) {    // Loop while incorrect input

      System.out.print("How much time will it take you to type one " +  
          "character? ");    // Asks the user for input.

      timeToTypeOnePwd = sUserInput.nextDouble();    // Retrieves input

      if (timeToTypeOnePwd <= 0.0 ) {   // Validating input greater than 0
        System.out.print("Incorrect input! Please provide a strictly ");
        System.out.println("positive number, i.e. > 0.\nTry again!\n");
      }
      else {
        isCorrectInput = true;    // It is correct input. This will
                                  // make the while loop exit on the 
                                  // next iteration.
      }
    }    // End of loop

    isCorrectInput = false;    // We reset this to false to validate the
                               // next input parameter from the user.

    while (isCorrectInput == false) {    // Loop while incorrect input
      // Ask for more input...
      System.out.print("Was that seconds [sec] or milliseconds [msec]? ");

      timeUnits = sUserInput.next();    // Retrieves input

      // Validating input against two values 'sec' or 'msec'.
      if (timeUnits.equals("sec"))    // Do nothing here.
        isCorrectInput = true;
      else if (timeUnits.equals("msec")) {    // Conver to seconds here.
        isCorrectInput = true;
        timeToTypeOnePwd *= MSEC_TO_SEC_RATE;
      } 
      else {                                               
        System.out.println("Incorrect input! Please provide a " +
            "valid string for the units. Choose either [sec] or [msec]." +
            "\nPlease, try again!\n");
      }
    }    // End of loop
    
    isCorrectInput = false;    // We reset this to false to validate the
                               // next input parameter from the user.

    while (isCorrectInput == false) {    // Loop while incorrect input

      // Asks the user for input.
      System.out.print("What is the target encryption level in bits? "); 

      encryptionLevel = sUserInput.nextShort();    // Retrieves input

      if (encryptionLevel <= 0 ) {   // Validating input greater than 0
        System.out.print("Incorrect input! Please provide a strictly ");
        System.out.println("positive integer, i.e. > 0.\nTry again!\n");
      }
      else {
        isCorrectInput = true;    // It is correct input. This will
                                  // make the while loop exit on the 
                                  // next iteration.
      }
    }    // End of loop

    // Now we make the calculation. Total number of possibilities can be
    // obtained by using the formula 2^n where n is the level of encryption in
    // bits. And as explained earlier we have to round (up) to an integer. Note
    // that we have to cast the result to a long, otherwise, we will get an
    // error.
    secondsItTakesToHack = Math.ceil(timeToTypeOnePwd * 
        Math.pow(2, encryptionLevel));

    // Now we produce the results in years, months, weeks, days, hours,
    // minutes, and seconds.

    if (secondsItTakesToHack >= 31539456.0 ) {    // A year is 31,539,456 sec
      double nYears = Math.floor(secondsItTakesToHack / 31539456.0);
      System.out.printf("%.0f years, ", nYears);
      secondsItTakesToHack -= (nYears * 31539456.0);
    }
    if (secondsItTakesToHack >= 2628288.0 ) {    // A month is 2,628,288 sec
      double nMonths = Math.floor(secondsItTakesToHack / 2628288.0);
      System.out.printf("%.0f months, ", nMonths);
      secondsItTakesToHack -= (nMonths * 2628288.0);
    }
    if (secondsItTakesToHack >= 604800.0 ) {    // A week is 604,800 sec
      double nWeeks = Math.floor(secondsItTakesToHack / 604800.0);
      System.out.printf("%.0f weeks, ", nWeeks);
      secondsItTakesToHack -= (nWeeks * 604800.0);
    }
    if (secondsItTakesToHack >= 86400.0 ) {    // A day is 86,400 sec
      double nDays = Math.floor(secondsItTakesToHack / 86400.0);
      System.out.printf("%.0f days, ", nDays);
      secondsItTakesToHack -= (nDays * 86400.0);
    }
    if (secondsItTakesToHack >= 3600.0 ) {    // An hour is 3,600 sec
      double nHours = Math.floor(secondsItTakesToHack / 3600.0);
      System.out.printf("%.0f hours, ", nHours);
      secondsItTakesToHack -= (nHours * 3600.0);
    }
    if (secondsItTakesToHack >= 60.0 ) {    // A minute is 60 sec
      double nMinutes = Math.floor(secondsItTakesToHack / 60.0);
      System.out.printf("%.0f minutes, ", nMinutes);
      secondsItTakesToHack -= (nMinutes * 60.0);
    }
    if (secondsItTakesToHack >= 0.0 ) {    // Notice that we ceil below
      double nSeconds = Math.ceil(secondsItTakesToHack);
      System.out.printf("%.0f seconds.", nSeconds);
      secondsItTakesToHack -= (nSeconds * 1.0);
    }
  }
}
