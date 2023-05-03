/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptiontesting;

/**
 *
 * @author itlabs
 */
public class ExceptionTestClass {
    public static void methodC() throws ExceptionC{
        System.out.print("Inside the methodC...");
        throw new ExceptionC("My ExceptionC is thrown");
    }
    public static void methodB() throws ExceptionB{
        System.out.print("Inside the methodB...");
        throw new ExceptionB("My ExceptionB is thrown");
    }
    public static void methodA() throws ExceptionA{
        System.out.print("Inside the methodA...");
        throw new ExceptionA("My ExceptionA is thrown");
    }
    
    
    public static void main(String[] args) {
        System.out.println("First line... before try");
        try{
            System.out.println("Second Line...");
            methodB(); //Force either ExceptionA, B or C
            System.out.println("This line will not output due to "
                    + "and exception throw");
        }
        catch(ExceptionA ea){
            System.out.println("inside exception catch");
        }
    }
}
