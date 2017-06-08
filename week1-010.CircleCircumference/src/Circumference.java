
import java.util.Scanner;

import static java.lang.Math.PI;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double lenght = radius * PI * 2;
        System.out.println("Circumference of the circle: " + lenght);
    }
}
