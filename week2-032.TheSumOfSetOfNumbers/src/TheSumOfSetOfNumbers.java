
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what?");
        int until = Integer.parseInt(reader.nextLine()); 
        int c=1; int sum =0;
        while (c <= until){
           
            sum+=c;
            
            c++;
        }
         System.out.println("Sum is " +sum);
          
    }
}
