package bcs345.basepluscommissionemployeetest;
// BasePlusCommissionEmployee test program.




public class BasePlusCommissionEmployeeTest {
   public static void main(String[] args) {
      // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
      HourlyEmployee employee2 = new HourlyEmployee("Jayson", "Gonzalez", "111-11-111", 15.0, 20.5);
      
      // get base-salaried commission employee data
      System.out.println("Base & Commission employee information obtained by get methods:");
      System.out.printf("%s %s%n", "First name is", employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is",  employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());

      employee.setBaseSalary(1000); 
      
      System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee.toString());
      
    
      System.out.println("\n \nHourly employee information obtained by get methods:");
      System.out.printf("%s %s%n", "First name is", employee2.getFirstName());
      System.out.printf("%s %s%n", "Last name is",  employee2.getLastName());
      System.out.printf("%s %s%n", "Social security number is", employee2.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", employee2.earnings());
   } 
} 