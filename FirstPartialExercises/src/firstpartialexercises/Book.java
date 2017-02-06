/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author Rodrigo
 */
public class Book {
    private String name;
    private Author authors[];
    private double price;
    private int qty = 0;
    
    public Book(String name, Author authors[], double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name, Author authors[], double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Author[] getAuthors(){
        return this.authors;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQty (){
        return this.qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
    @Override
    public String toString(){
        return "Book[Name="+this.name+"authors={"+getAuthorNames()+"},price="+this.price+",qty="+this.qty+"]";
    }
    
    public String getAuthorNames(){
        String a = "";
        for (int i=0;i<=authors.length;i++){
            a += authors[i].toString()+",";
        }
        return a;
    }
    
}
