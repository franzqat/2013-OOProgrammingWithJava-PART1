/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Bird{

    private final String name;
    private final String latin;
    private int observed;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        observed = 0;
    }


    public String getName() {
        return name;
    }


    public void observe() {
        observed++;
    }


    @Override
    public String toString() {
        return name + " (" + latin + "): " + observed + " observations";
    }


    public int getObserved() {
        return observed;
    }

}
