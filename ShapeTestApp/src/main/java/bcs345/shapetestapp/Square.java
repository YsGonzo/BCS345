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
public class Square extends TwoDimensionalShape{
    private double length;
    private double height;
    
    //Square Constructor
    public Square(double length, double height){
        this.length = length;
        this.height = height;
    }
    
    // Set Length and Height of Square
    public void setLength(double length){
        this.length = length;
    }
    public void setHeight(double height){
        this.height = height;
    }
    
    
    // Calculate Area
    @Override
    public double getArea(){
        return length * height;
    }
    @Override
    public String toString() {
      return String.format("Area of square is : .2%f", getArea());
   }
}
