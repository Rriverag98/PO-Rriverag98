/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * @author Rodrigo
 */
public class Articulo {
    public int SKU;
    private int Existence;
    private double Price;
    private double Cost;
    public String Description;
    
    public Articulo(int SKU,double Cost,String Description){
        this.SKU=SKU;
        this.Cost=Cost;
        this.Description=Description;
        
    }
    public Articulo(){
        this(0,0.00,"Sin Descripcion");
        }
    public int getSKU(){
        return this.SKU;
    }
    public void setSKU(int SKU){
        this.SKU=SKU;
    }
    public int getExistence(){
         return this.Existence;
     }
    public void setExistence (int Existence){
         this.Existence=Existence;
     }
    public double getPrice(){
         return this.Price;
     }
    public void setPredio(double Price){
         this.Price=Price;
     }
    public double getCost(){
         return this.Cost;
     }
    public void setCost(double Cost){
         this.Cost=Cost;
     }
    public String getDescription(){
        return this.Description;
    }
    public void setDescipcion(String Description){
        this.Description=Description;
    }
    public void purchase(int a, double b) {
       setExistence(a);
       setCost(b);
        
    }
       public boolean sale(int n){
           if(getExistence()>=n){
               setExistence(getExistence()-n);
           return true;
       }else{ return false;
           }
           }
       public double checkExistence(){
           return Existence;
         
       }
       public void updatePrice(double price){
           this.Price=price;
       }
}