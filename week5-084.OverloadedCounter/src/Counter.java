/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Counter {
    private boolean controllo;
    private int counter=0;
    
    
    public Counter(int startingValue, boolean check) {
        counter = startingValue;
        controllo = check;
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
 
    public Counter(boolean check){
        this(0,check);
    }
    public Counter(){
        controllo = false;
        counter = 0;
    }
    
    public int value() {
        return counter;
    }
    
    public void increase(){
        counter++;
    }
    public void decrease() {
        if (controllo){
            if (counter > 0)counter--;
        }
        if (!controllo) counter--;
        
    }
    
    public void increase(int increaseAmount){
        if (increaseAmount > 0)
        counter +=increaseAmount;
    }
    public void decrease(int decreaseAmount){
        if (controllo){
            if ((counter - decreaseAmount) < 0) counter = 0;
            else counter-=decreaseAmount;
        }
        else if (decreaseAmount > 0)
        counter-=decreaseAmount;
        
    }
}
