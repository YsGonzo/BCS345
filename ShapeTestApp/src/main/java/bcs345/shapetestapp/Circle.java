/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs345.shapetestapp;
import java.lang.Math;
/**
 *
 * @author jayso
 */
public class Circle extends TwoDimensionalShape{
    private double radius;
    
    //Circle Constructor
    public Circle(double radius){
        this.radius = radius;
    }
    
    
    //Set Radius of Circle
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    //Get Area of Circle
    @Override
    public double getArea(){
        return Math.PI * (radius * radius);
    }
    @Override
    public String toString() {
      return String.format("Area of circle is : .2%f", getArea());
   }
}
