
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String txt = reader.nextLine();
        System.out.print("Lenght of the first part: ");
        int len = Integer.parseInt(reader.nextLine());
        if (len >=0 && len <= txt.length())
        System.out.println("Result: " +txt.substring(0,len));
    }
}
