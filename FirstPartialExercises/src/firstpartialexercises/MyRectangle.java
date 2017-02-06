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
public class MyRectangle {
    private MyPoint botRight;
    private MyPoint topLeft;
    
    public MyRectangle(int x1, int y1, int x2,int y2){
        this.botRight = new MyPoint(x1,y1);
        this.topLeft = new MyPoint(x2,y2);
    }
    
    public MyRectangle(MyPoint botRight, MyPoint topLeft){
        this.botRight=botRight;
        this.topLeft=topLeft;
    }
    
    public MyPoint getBR() {
        return botRight;
    }
    
    public void setBR(MyPoint botRight) {
        this.botRight = botRight;
    }
    
    public void setBR(int x, int y){
        this.botRight.setXY(x, y);
    }
    
    public MyPoint getTL() {
        return topLeft;
    }
    
    public void setTl(MyPoint topLeft) {
        this.topLeft = topLeft;
    }
    
    public void setTL(int x, int y){
        this.topLeft.setXY(x, y);
    }
    
    @Override
    public String toString(){
        return "MyRectangle[botRight="+this.botRight+",topLeft="+this.topLeft+"]";
    }
    
    public double getArea(){
        return (this.botRight.getX()-this.topLeft.getX())*(this.botRight.getY()-this.topLeft.getY());
    }
    
    public double getPerimeter(){
        return ((this.botRight.getX()-this.topLeft.getX())+(this.topLeft.getY()-this.botRight.getY()))*2;
    }
}
