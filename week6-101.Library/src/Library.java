


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
public class Library {
    private ArrayList<Book> list;
    public Library(){
        list = new ArrayList<Book>();        
    }
    public void addBook(Book newBook){
        list.add(newBook);
    }
    public void printBooks(){
        for (Book b : list)
            System.out.println(b);
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        return searchBook(title, null, -1);
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        return searchBook(null, publisher, -1);
    }

    public ArrayList<Book> searchByYear(int year) {
        return searchBook(null, null, year);
    }

    public ArrayList<Book> searchBook(String title, String publisher, int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book b : list) {
            if (StringUtils.included(b.title(), title)
                    || StringUtils.included(b.publisher(), publisher)
                    || b.year() == year) {
                found.add(b);
            }
        }
        return found;
    }

}
