
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        //un anno e' bisestile se il modulo è 0
        // se l'anno è divisibile per 100, è bisestile se è anche divisibile per 400
        if (year % 400 == 0 && year % 100 == 0)
            System.out.println("The year is a leap year.");
        else if (!(year %100 == 0) && year % 4 == 0)
            System.out.println("The year is a leap year.");
        else
            System.out.println("The year is not a leap year.");

        
    }
}
