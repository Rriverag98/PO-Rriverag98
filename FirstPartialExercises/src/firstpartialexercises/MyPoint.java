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
public class MyPoint {
    private int x = 0;
    private int y = 0;
    
    public MyPoint(){
     x = 0;
     y = 0;
    }
    
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
public int[] getXY(){
        int[] a = {this.x,this.y};
        return a;
    }
    
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }
    
     @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    
    public double distance(int x,int y){
        int a = this.x - x;
        int b = this.y - y;
      return Math.sqrt(a*a + b*b);
    }
    
    public double distance(MyPoint another){
        int a = this.x - another.x;
        int b = this.y - another.y;
      return Math.sqrt(a*a + b*b);
    }
    
    public double distance(){
        int a = this.x;
        int b = this.y;
      return Math.sqrt(a*a + b*b);
    }
}
