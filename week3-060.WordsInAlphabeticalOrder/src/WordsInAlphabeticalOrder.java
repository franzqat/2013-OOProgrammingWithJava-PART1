
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        while (true){
            System.out.print("Type a word: ");
            String input = reader.nextLine();
            if (input.isEmpty()) break;
            words.add(input);
        }
        Collections.sort(words);
        System.out.println("You typed the following words:");
        int i =0;
        while (i<words.size()){
            System.out.println(words.get(i));
            i++;
        }
    }
}
