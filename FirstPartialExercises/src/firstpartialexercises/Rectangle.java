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
public class Rectangle {
    private float length = 1.0f;
    private float width  = 1.0f;
    
    public Rectangle(){
        this(1.0f,1.0f);
    }
    
    public Rectangle (float length, float width){
        this.length = length;
        this.width = width;
    }
    
    public float getLength(){
        return this.length;
    }
    
    public void setLength(){
        this.length = length;
    }
    
    public float getWidth(){
        return this.width;
    }
    
    public void setWidth(){
        this.width = width;
    }
    
    public double area(){
        return this.length*this.width;
    }
    public double perimeter(){
        return this.length*2+this.width*2;
    }
     @Override
    public String toString(){
        return "Rectangle[lenght= " + this.length + ",width= " + this.width ;
    }
}
