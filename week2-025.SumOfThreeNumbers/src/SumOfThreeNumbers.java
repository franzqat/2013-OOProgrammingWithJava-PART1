
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.print("Type the first number: ");
        int read = Integer.parseInt(reader.nextLine()); // store numbers read form user in this variable
        sum +=read;
        System.out.print("Type the second number: ");
        read = Integer.parseInt(reader.nextLine()); // store numbers read form user in this variable
        sum +=read;
        System.out.print("Type the third number: ");
        read = Integer.parseInt(reader.nextLine()); // store numbers read form user in this variable
        sum +=read;
        // Write your program here
        // Use only variables sum and read
        /*Type the second number: 6
        Type the third number: 12

        Sum: 21*/
        
        System.out.println("Sum: " + sum);
    }
}
