
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
public class Phonebook {
    private ArrayList<Person> list;
    
    public Phonebook(){
        list = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        Person p = new Person(name, number);
        list.add(p);
    }
    
    public void printAll(){
        for (Person p : list)
            System.out.println(p);
    }
    
    public String searchNumber(String name) {
        for (Person p : list) {
            if (p.getName().equals(name)) {
                return p.getNumber();
            }
            
        }
    return "number not known";
    }
}
