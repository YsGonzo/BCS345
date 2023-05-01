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
public class ShapeTestApp {
    public static void main(String[] args) {
        // Create Subclass Objects                                          
        Circle circle1 = new Circle(20);
        Square square1 = new Square(20, 10);
        Triangle triangle1 = new Triangle(20,10);
        Sphere sphere1 = new Sphere(20);
        Cube cube1 = new Cube(15);
        Tetrahedon tetrahedon1 = new Tetrahedon(40);
        
        // Create Shape Array
        Shape[] shapes = new Shape[6];
        // Initiallize Shape Array
        shapes[0] = circle1;
        shapes[1] = square1;
        shapes[2] = triangle1;
        shapes[3] = sphere1;
        shapes[4] = cube1;
        shapes[5] = tetrahedon1;
        
        
        for (Shape shapeIndex : shapes) {
            System.out.println(shapeIndex); // invokes toString
        } 
    }
}
