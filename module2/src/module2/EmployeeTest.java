/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;

import java.util.Scanner;

/**
 *
 * @author itlabs
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Employee coder = new Employee();
        Employee coder2 = new Employee();
        
        System.out.print("Enter employee's first name: ");
        String newFirstName = keyboard.nextLine();
        
        System.out.print("Enter employee's last name: ");
        String newLastName = keyboard.nextLine();
        
        System.out.print("Enter employee's monthly salary: ");
        int newMonthlySalary = keyboard.nextInt();
        
        coder.setfirstName(newFirstName);
        coder.setlastName(newLastName);
        coder.setmonthlySalary(newMonthlySalary);
        
        System.out.printf(coder.getfirstName() + " " + 
            coder.getlastName() + " - $" + coder.getmonthlySalary() + "\n");
        System.out.printf(coder2.getfirstName() + " " + 
            coder2.getlastName() + " - $" + coder2.getmonthlySalary() + "\n");
        
        coder.setmonthlySalary((newMonthlySalary + (newMonthlySalary * .10)));
        
        
        System.out.printf(coder.getfirstName() + " got a raise! \nNew Salary: "
                + coder.getmonthlySalary() + "\n");
    }
    
}

