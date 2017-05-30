import java.util.Random;

public class PasswordRandomizer {
    private int lenght;
    private Random r = new Random();
    
            
            
    public PasswordRandomizer(int lunghezza) {
        // Initialize the variabl
        lenght = lunghezza;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String s = "";
        while (i < lenght) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(r.nextInt(21));
            s += symbol;
            i++;
        }
        return s;
    }
}