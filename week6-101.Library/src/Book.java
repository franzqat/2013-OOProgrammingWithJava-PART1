/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Book {
    private String title, publisher;
    private int year;
    
    public Book(String tit, String publ, int y){
        title = tit;
        publisher =publ;
        year = y;
    }
    
    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public int year() {
        return year;
    }
    
    public String toString(){
        return title + ", " + publisher + ", " + year;
    }
    
}
