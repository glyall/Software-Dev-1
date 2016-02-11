import java.io.*;
import java.util.Scanner;
public class driver_proj0 {
    public static void main(String[] args) {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        String x = " ";
        while(x != null) {
            try {
                x = f.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(x);
        }
    }
}