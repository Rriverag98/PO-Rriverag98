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
public class FirstPartialExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyRectangle test = new MyRectangle(2,0,0,2);
        System.out.println(test.getTL());
        System.out.println(test.getBR());
        System.out.println(test);
        System.out.println(test.getArea());
        System.out.println(test.getPerimeter());
        MyPoint a = new MyPoint(6,1);
        MyPoint b = new MyPoint(1,6);
        MyRectangle test2 = new MyRectangle(a,b);
        System.out.println(test2.getTL());
        System.out.println(test2.getBR());
        System.out.println(test2);
        System.out.println(test2.getArea());
        System.out.println(test2.getPerimeter());
    }
    
}
