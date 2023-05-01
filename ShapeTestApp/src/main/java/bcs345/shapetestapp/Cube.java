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
public class Cube extends ThreeDimensionalShape{
    private double side;

    //Square Constructor
    public Cube(double side){
        this.side = side;
    }
    
    // Set Length and Height of Square
    public void setSide(double side){
        this.side = side;
    }
    
    
    // Calculate Area
    @Override
    public double getArea(){
        return 6 * (Math.pow(side, 2));
    }
    @Override
    public double getVolume(){
        return (Math.pow(side, 3));
    }
    @Override
    public String toString() {
      return String.format("Area of square is : .2%f,  Volume of cube is: .2%f", getArea(), getVolume());
   }
}
