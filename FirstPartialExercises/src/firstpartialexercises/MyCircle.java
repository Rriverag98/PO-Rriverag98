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
public class MyCircle {
    private MyPoint center;
    private int radius;
    
    public MyCircle(){
        center = new MyPoint(0,0);
        radius = 1;
    }
    
    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x,y);
        this.radius = radius;
 }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
 }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public int getCenterX(){
        return center.getX();
    }
    
    public void setCenterX(int x){
        this.center.setX(x);
    }
    
    public int getCenterY(){
        return center.getY();
    }
    
    public void setCenterY(int y){
        this.center.setY(y);
    }
    
    public int[] getCenterXY(){
        int[] a = {center.getX(),center.getY()};
        return a;
    }
    
    public void setCenterXY(int x,int y){
        this.center.setXY(x, y);
    }
    
    @Override
    public String toString(){
        return "MyCircle[radius= +"+this.radius+",center = "+center.toString()+"]";
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
    
}
