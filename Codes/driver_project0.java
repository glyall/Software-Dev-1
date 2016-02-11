import java.io.*;

public class driver_project0 {
    public static void main(String[] args) {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in)); 
        String x = " ";
        while(x != null) {
            try {
              if (x != null);  
              x = f.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(x);
        }
    }
}