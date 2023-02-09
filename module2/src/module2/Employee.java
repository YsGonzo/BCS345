/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;

/**
 *
 * @author itlabs
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    
    
    // Constructors
    public Employee() {
        firstName = "Jane";
        lastName = "Doe";
        monthlySalary = 0;
    }
    
    // Getters
    public String getfirstName() {
        return firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public double getmonthlySalary() {
        return monthlySalary;
    }
    // Setters
    public void setfirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    public void setlastName(String newLastName) {
        this.lastName = newLastName;
    }
    public void setmonthlySalary(double newSalary) {
        if (newSalary > 0) {
            this.monthlySalary = newSalary;
        }
        else {
            System.out.println("Negative Value entered. Try Again.");
        }
    }
}
