
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        if (age == 120) System.out.println("OK");
        else if (age > 100) System.out.println("Impossible");
         else if (age > 30) System.out.println("OK");
        else if (age > 18) System.out.println("\nYou have reached the age of majority!");
       
        else if (age < 0) System.out.println("Impossible");
        else if  (age < 11)System.out.println( "OK");
        else if (age == 0) System.out.println( "OK");

       
        else   System.out.println("You have not reached the age of majority yet!");
            
    }
}
