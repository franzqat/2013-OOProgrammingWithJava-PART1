
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class BirdWatcher {
    
    private ArrayList<Bird> birds = new ArrayList<Bird>();

    public void add (String nome, String latin) {
        birds.add(new Bird(nome,latin));        
    }

    private Bird searchBird(String searched) {
        for (Bird b : birds)
            if (b.getName().contains(searched))
                return b;
        return null;
    }
    
    private void print(Bird b){
        System.out.println(b);
       
    }
    public void show(String s){
       print(searchBird(s));

    }
    
    public void observe(String s){
        if (searchBird(s)!= null) searchBird(s).observe();
        else System.out.println("Not a bird!");
    }
    
    
    public void Statistics(){
    for (Bird b : birds)
        show(b.getName());  
    }
    
}
