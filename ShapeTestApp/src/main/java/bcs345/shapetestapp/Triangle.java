/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs345.shapetestapp;

/**
 *
 * @author jayso
 */
public class Triangle extends TwoDimensionalShape{
    private double base;
    private double height;
    
        //Square Constructor
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    // Set Length and Height of Square
    public void setLength(double base){
        this.base = base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    
    
    // Calculate Area
    @Override
    public double getArea(){
        return base * height * .5;
    }
    @Override
    public String toString() {
      return String.format("Area of triangle is : .2%f", getArea());
   }
}
