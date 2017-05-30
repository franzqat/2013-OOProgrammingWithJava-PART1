
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Francesco
 */
public class Menu {

    private BirdWatcher bw = new BirdWatcher();
    private Scanner reader = new Scanner(System.in);

    public String scanner(){
        return reader.nextLine();
    }
    public void menu(String s) {
       
        // int n = selection(s);
        switch (s) {
            case "Quit":
                System.out.println("Exit");
                break;
            case "Add":
                System.out.println("Name: ");
                String s1 = reader.nextLine();
                System.out.println("Latin Name: ");
                String s2 = reader.nextLine();
                bw.add(s1, s2);
                break;
            case "Observation":
                System.out.println("Name: ");
                s1 = reader.nextLine();
                bw.observe(s1);
               
                break;
            case "Statistics":
                bw.Statistics();
                    break;
            case "Show":
                System.out.println("Name: ");
                s1 = reader.nextLine();
                bw.show(s1); 
                break;

        }
    }

    /*  
     private int selection(String s){
     if (s.contains("Add"))
     return 1;
     else if (s.contains("Observation"))
     return 2;
     else if (s.contains("Statistics"))
     return 3;
     else if (s.contains("Show"))
     return 4;
     else return 0;
     }*/
}
