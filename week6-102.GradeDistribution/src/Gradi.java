/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */

public class Gradi implements Esami {
    private int allVotes=0;
    private int accepted = 0;
    private int[] grades = {0, 0, 0, 0, 0, 0};
    
    @Override
    public Esami voto(int input) {
        if (input < 30) grades[0]++;
        else if (input < 35)  grades[1]++;
        else if (input < 40)   grades[2]++;
        else if (input < 45)   grades[3]++;
        else if (input < 50)  grades[4]++;
        else if (input <= 60) grades[5]++;
        
        if (input > 30 && input <= 60 ) accepted+=input;
        allVotes+=input;
        System.out.println("Voto inserito");
       return this;
    }
    @Override
    public int getVoto(){
        return allVotes;
    }

    @Override
    public void printGrades() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " );
            printStars(grades);
        }
    }

    private void printStars(int[] grades) {
      for (int i = 0; i < grades[i] ; i++)
          System.out.print("*");
    }
}