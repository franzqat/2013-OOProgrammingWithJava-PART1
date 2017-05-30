
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        BirdWatcher bw = new BirdWatcher();
        Menu m = new Menu();
        String s;
        do {
            System.out.print("? ");
            s = m.scanner();
            m.menu(s);
       }
       while (!s.equals("Quit"));
    }

}
