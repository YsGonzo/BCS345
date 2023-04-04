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
public class HourlyEmployee extends Employee {
    double hours;
    double wage;
    
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }
    
    // Get Hours and Wage
    public double getHours() { return hours; }
    public double getWage() { return wage; }
    
    // Set Hours and Wage
    public void setHours(double hours){
        if (hours < 0.0 || hours > 168) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <=168");
        }
        this.hours = hours;
    }
    public void setWage(double wage){
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }
    
    
    // Earning Method
    public double earnings() {
      return getHours() * getWage();
   } 
    
    @Override 
   public String toString() {
      return String.format("%s: %s %s%n%s: %s%n%s:", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber(), 
         "earnings", earnings());
   } 
}
