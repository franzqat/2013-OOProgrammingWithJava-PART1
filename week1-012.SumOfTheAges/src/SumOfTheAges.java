
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String a = reader.nextLine();
        System.out.print("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());
        System.out.println("");

        System.out.print("Type your name: ");
        String b = reader.nextLine();
        System.out.print("Type your age: ");
        int bge = Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.println(a+" and " + b + " are " + (age+bge) + " years old in total");
    }
}
