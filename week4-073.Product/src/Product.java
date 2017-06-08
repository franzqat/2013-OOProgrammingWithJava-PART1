/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Product {
    private String name;
    private int amount;
    private double price;
    
    public Product(String initName, double price,int amount){
        name= initName;
        this.amount = amount;
        this.price=price;
    }
    public void printProduct(){
        System.out.println(name + ", price " + price + ", amount " + amount);
    }
}
