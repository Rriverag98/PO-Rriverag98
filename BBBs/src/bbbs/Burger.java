/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbbs;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Burger {
    private String bread;
    private String meat;
    private double price;
    private ArrayList <Ingredient> additions;
    protected int limAdditions;
    
    public Burger(String bread, String meat, double price) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.limAdditions = 6;
    }
    
    public boolean setAddition (Ingredient addition)
    {
        if (additions.size()<this.limAdditions){
            return this.additions.add(addition);
        }
        System.out.println("Limit exceeded");
        return false;
    }
    
    public boolean setAddition (String name,double price)
    {
        if (additions.size()<this.limAdditions){
            return this.additions.add(new Ingredient (name,price));
        }
        System.out.println("Limit exceeded");
        return false;
    }
    
    public void getTotal(){
        double total=0;
    System.out.println("This is a "+ this.meat+" burguer in "+ this.bread+" with the base price of: "+ this.price);
    
    total += this.price;
    
    for(Ingredient tempIngredient : this.additions){
        System.out.println("with "+ tempIngredient.getName() + " at "+ tempIngredient.getPrice());
        
        total += tempIngredient.getPrice();
        }
    }
    
    /**
     * @return the bread
     */
    public String getBread() {
        return bread;
    }

    /**
     * @param bread the bread to set
     */
    public void setBread(String bread) {
        this.bread = bread;
    }

    /**
     * @return the meat
     */
    public String getMeat() {
        return meat;
    }

    /**
     * @param meat the meat to set
     */
    public void setMeat(String meat) {
        this.meat = meat;
    }
    
}
