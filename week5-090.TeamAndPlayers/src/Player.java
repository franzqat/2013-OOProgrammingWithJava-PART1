/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Player {
    private String name;
    private int goals;
    
    public Player(String n){
        this(n, 0);
        
    }
    public Player(String n, int g){
        name = n;
        goals = g;
    }
    
    public String getName(){
        return name;
    }
    
    public int goals(){
        return goals;
    }
    public String toString(){
        return name + ", goals " + goals; 
    }
}
