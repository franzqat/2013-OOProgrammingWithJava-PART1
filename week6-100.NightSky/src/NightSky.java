
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density){
        this(density, 20,10);
    }
    public NightSky(int width, int height){
        this(0.1, width, height);
    }
    
    public NightSky(double density, int width, int height){
        this.density=density;
        this.width = width;
        this.height = height;
        int starsInLastPrint = 0;
    }
    
    public void printLine(){
        String star = "*";
        Random r = new Random();        
        for (int i = 0; i < width; i++) {
            
            int rand = r.nextInt(101);
            if (rand <= density * 100) {
                starsInLastPrint++;
                System.out.print(star);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    
    public void print(){
        for (int i = 0; i < height; i++) {
            printLine();            
        }
    }
    public int starsInLastPrint(){
        int temp = starsInLastPrint;
        starsInLastPrint = 0;
        return temp;

    }
    
}
