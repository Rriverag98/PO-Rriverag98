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
public class Circle {
    private double radius = 1.0;
    
    public Circle(){
        radius = 1.0;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }   
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    
    public double getCircumference(){
        return this.radius * 2 * Math.PI;
    }
        
    @Override
    public String toString(){
        return "Circle[radius=" + this.radius ;
    }
    
}   
