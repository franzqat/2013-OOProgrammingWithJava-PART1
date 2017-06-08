import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        int c=1, fact =1;
        if (input ==0)
                fact = 1;
        else {
                
            while (c<=input){
             fact*=c;
              c++;
                }        
        }
        System.out.print("Factorial is " + fact);

    }
}
