/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class BoundedCounter {
    
    private int counter=0;
    private final int upperBound;
    
    public BoundedCounter(int upperBound){     
        this.upperBound = upperBound;       
    }
    public void next(){
        if (counter == upperBound) counter = 0;
        else counter++;
    }
  
    public int getValue() {
        return counter;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= upperBound) {
            counter = value;
        }
    }

    public String toString(){
        if (counter < 10) return "0"+counter;
        return ""+counter;
    }
    
    
}
