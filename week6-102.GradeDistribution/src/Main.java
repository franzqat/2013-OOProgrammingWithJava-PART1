import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        GradeDistribution gd = new GradeDistribution();
        System.out.println("Grade distribution:");
        System.out.println("Type exam scores, -1 completes:");
        int input;
        do{
            input = Integer.parseInt(reader.nextLine());
            gd.registra(input);            
        }
        while (input != -1);
        
        //gd.testGrades();
        gd.printGrades();
        gd.getAllScores();
        double acceptance = gd.acceptance();
        System.out.print("Acceptance percentage:" + acceptance);

        System.out.println("");
        
    }
}


/*
       System.out.println("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
         
        if (points < 0)         System.out.println("Impossible");
        else if (points < 30)   System.out.println("Grade: failed"); 
        else if (points < 35)   System.out.println("Grade: 1");
        else if (points < 40)   System.out.println("Grade: 2");
        else if (points < 45)   System.out.println("Grade: 3");
        else if (points < 50)   System.out.println("Grade: 4");
        else if (points <= 60)  System.out.println("Grade 5");
        else System.out.println("Invalid");
*/