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
public class Sphere extends ThreeDimensionalShape {
    private double radius;
    
    //Sphere Constructor
    public Sphere(double radius){
        this.radius = radius;
    }
    
    
    //Set Radius of Sphere
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    //Get Area of Sphere
    @Override
    public double getArea(){
        return 4 * Math.PI * (radius * radius);
    }
    @Override
    public double getVolume(){
        return (4/3) * Math.PI * (Math.pow(radius, 3));
    }
    @Override
    public String toString() {
      return String.format("Area of Sphere is : .2%f,  Volume of Sphere is: .2%f", getArea(), getVolume());
   }
}
