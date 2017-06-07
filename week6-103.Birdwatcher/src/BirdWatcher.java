
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collector;
import java.util.stream.Collectors;


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


    //versione Funzionale
 /*   private Bird searchBird(String searched){  
     //Se la implemento su observe direttamente non mi serve più il searchbird privato
     return (birds.stream()
     .filter(s -> s.getName().equals(searched))
     .findAny().get());
     }
*/
    //La versione funzionale non richiede più searchBird
    public void observe(String searched){
       search(searched).forEach(Bird::observe);       
        }


    /* 
     *E' diventata obsoleta con la programmazione funzionale
    public void show(String s){
       print(searchBird(s));
     */
    
    public List<Bird> search(String searched){
       return birds.stream()
                .filter(s -> s.getName().equals(searched))
                .collect(Collectors.toList());
    }
    
     public void show(String searched){
         search(searched).forEach(System.out::println);
     }
    
     
    public void Statistics() {
        //for (Bird b : birds)
        //  show(b.getName());  
        birds.stream()
                .map(Bird::getName)
                .forEach(System.out::println);
    }

}
