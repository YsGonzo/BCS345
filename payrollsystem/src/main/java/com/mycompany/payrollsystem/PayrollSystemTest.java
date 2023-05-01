package com.mycompany.payrollsystem;
// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {
   public static void main(String[] args) {
       Date emp1 = new Date(10,18,2001);
       Date emp2 = new Date(4,19,2000);
       Date emp3 = new Date(9,20,2002);
       Date emp4 = new Date(8,21,2003);
       Date emp5 = new Date(10,18,2001);
       Date today = new Date(4,25,2023);
       
      // create subclass objects                                          
        SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee("John", "Smith", "111-11-1111", emp1, 800.00);
        SalariedEmployee salariedEmployee2 =                                 
         new SalariedEmployee("Jayson", "Gonzalez", "555-55-5555", emp5, 500.00);
      HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee("Karen", "Price", "222-22-2222", emp2, 16.75, 40);  
      CommissionEmployee commissionEmployee =                             
         new CommissionEmployee("Sue", "Jones", "333-33-3333", emp3, 10000, .06);                      
      BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", emp4, 5000, .04, 300);

      // create four-element Employee array
      Employee[] employees = new Employee[5]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;
      employees[4] = salariedEmployee2;
        System.out.printf("Today's Date: " + today + "%n");
      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      for (Employee currentEmployee : employees) {
         if(currentEmployee.earnings() <= 600){
            System.out.println(currentEmployee); // invokes toString
         
         // determine whether element is a BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // downcast Employee reference to 
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = 
                   (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                   "new base salary with 10%% increase is: $%,.2f%n%n",
                   employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }
      } 

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++) {      
         System.out.printf("Employee %d is a %s%n", j,  
            employees[j].getClass().getName());         
      }                                                 
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
