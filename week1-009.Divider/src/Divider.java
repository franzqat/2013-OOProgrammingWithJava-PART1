
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        float first = Float.parseFloat(reader.nextLine());
        System.out.print("Type another number: ");
        float second = Float.parseFloat(reader.nextLine());

        System.out.println("Division: " + (int) first + " / " + (int) second + " = " + (first / second));
    }
}
