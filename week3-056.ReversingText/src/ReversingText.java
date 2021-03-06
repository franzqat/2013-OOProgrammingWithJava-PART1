
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        int i = text.length()-1;
        // note that method does now print anything, it RETURNS the reversed string
        String help = ""; 
        while (i >= 0){
            help += text.charAt(i);
            i--;           
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
