/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class GradeDistribution { //  è un Context
    private int allScores=0;
    //private Esami esami = new Gradi();
    private int[] grades = {0, 0, 0, 0, 0, 0};
    private int acceptable =0;
    

    public boolean inputCheck(int input) {       
        return input > 0 && input <= 60;
    }
    public void registra(int input){
        if (input == -1) {
            return;
        }
        if (inputCheck(input)) {
            allScores++;
            voto(input);
        }
    }
    public int getAllScores(){        
        return allScores;
    }
    
    public double acceptance(){
    //    System.out.println(allScores+ " --- getvoto " + getAllScores());
       System.out.println("Allscores: " + allScores + " acceptable :" + acceptable);
    //   if (allScores > 0) {
            double acceptance = acceptable / (allScores * 1.0);
       //     System.out.println(acceptance);
            acceptance= acceptance * 100.0;
            return acceptance;
   //    }
   //     return 0;
    }
    
    public void printGrades(){
        for (int i = 0; i < grades.length; i++) {
            System.out.print(i + ": " );
            printStars(grades[i]);
            System.out.println("");
        }
        
    }
    
    public void testGrades(){
        for (int i = 0; i < grades.length; i++) {
            System.out.print(i + ": " + grades[i]);
            System.out.println("");
        }
        
    }
    
    private void printStars(int voto) {
        for (int i = 0; i < voto; i++) {
            System.out.print("*");
        }
    }


    
    private void voto(int input){
        if (input > 30)  acceptable++;
        if (input < 30) grades[0]++;
        else if (input < 35)  grades[1]++;
        else if (input < 40)   grades[2]++;
        else if (input < 45)   grades[3]++;
        else if (input < 50)  grades[4]++;
        else if (input <= 60) grades[5]++;
        
    }




}