/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs345.basepluscommissionemployeetest;

/**
 *
 * @author jayso
 */
public class Employee {
   protected String firstName;                        
   protected String lastName;                         
   protected String socialSecurityNumber;
   
   
   // Employee constructor
   public Employee(String firstName, String lastName, String socialSecurityNumber){
       this.firstName = firstName;
       this.lastName = lastName;
       this.socialSecurityNumber = socialSecurityNumber;
   }
   // return first name
   public String getFirstName() {return firstName;}

   // return last name
   public String getLastName() {return lastName;}

   // return social security number 
   public String getSocialSecurityNumber() {return socialSecurityNumber;}
}
