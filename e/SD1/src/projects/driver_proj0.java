

/**
 * file: driver_proj0.java
 * author: Gregory Lyall
 * course: CMPT 220
 * assignment: Project 0
 * due date: October 30, 2015
 * version: 2.0
 * 
 */
package projects;
import java.io.*;
public class driver_proj0 {
    public static void main(String[] args) {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in)); 
        String x = " ";
        while(x != null) {
            try {
                x = f.readLine();
                if(x != null)
                System.out.println(x);
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
