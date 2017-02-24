/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbbs;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Deluxe extends Burger {

    public Deluxe(String bread, String meat, double price, Ingredient addition1,Ingredient addition2) {
        super(bread, meat, price);
        limAdditions = 2;
        this.setAddition(addition1);
        this.setAddition(addition2);
    }
    
    public Deluxe(String bread, String meat, double price, String name1,double price1,String name2,double price2) {
        super(bread, meat, price);
        limAdditions = 2;
        this.setAddition(name1,price1);
        this.setAddition(name2,price2);
    }
    
    @Override
    public void getTotal(){
        System.out.println("This is a Deluxe Burger");
        super.getTotal();
    }
    
}
