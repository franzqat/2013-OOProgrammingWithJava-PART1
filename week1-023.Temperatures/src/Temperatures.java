
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        // Graph is used as follows:
        /*Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        */
        // Remove or comment out these lines above before trying to run the tests.
        
        while (true){
            
            double value = Double.parseDouble(reader.nextLine());
            if (value > 40 || value < -30)
                System.out.println("This value is not valid. Try again");
            else
            Graph.addNumber(value);
        }
    }
}