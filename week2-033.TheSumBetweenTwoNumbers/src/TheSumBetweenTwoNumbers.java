
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int low = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int up =  Integer.parseInt(reader.nextLine());
        int c =low, sum =0;
        while (c<=up){
            sum+=c;
            c++;
            
        }
        System.out.println("Sum is: "+ sum);
        
    }
}
