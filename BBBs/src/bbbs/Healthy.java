/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbbs;

/**
 *
 * @author Rodrigo
 */
public class Healthy extends Burger{
    public Healthy (String bread,String meat,double price){
        super(bread,meat,price);
        limAdditions = 6;
    }
    
    @Override
    public void getTotal(){
        System.out.println("This is a Healthy Burger");
        super.getTotal();
    }
    
}
