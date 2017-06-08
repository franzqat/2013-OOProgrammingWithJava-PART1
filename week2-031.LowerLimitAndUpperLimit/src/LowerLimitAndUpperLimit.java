
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int f = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int l = Integer.parseInt(reader.nextLine());
        int num = f;
                
        while (num <= l){
            System.out.println(num);
            num++;
        }
        
    }
}
