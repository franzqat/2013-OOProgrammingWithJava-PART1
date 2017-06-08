
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int exp = Integer.parseInt(reader.nextLine());
        int c=0;
        int result=0;
             
        while (c<=exp){
            result += (int) Math.pow(2, c);
            c++;
            
        }
        
        System.out.println("The result is " + result);
    }
}
