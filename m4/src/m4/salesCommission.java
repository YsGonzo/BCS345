package m4;
import java.util.Scanner;
/**
 *
 * @author Jayson Gonzalez
 */
public class salesCommission {
    
    public static void main(String[] args) {
        // Scanner class, Employees array, Employee's weekly $200 income, 
        // Default commission value of 0, low & high integers for Tabular format
        Scanner keyboard = new Scanner(System.in);
        int[] employees = new int[9];
        double commission = 0;
        int low = 200; int high = 299;
        
        System.out.print("How many people are working here: ");
        int salespeople = keyboard.nextInt();
        // Choose how many employee's salaries will be calculated
        for(int i = 0; i < salespeople; i++){
            System.out.printf("How much did worker #" + i + " make in commission: ");
            commission = keyboard.nextDouble();
            double income = 200;
            income += (.09 * commission);
            // Array index is matched to income brackets
            if     (income < 299 && income > 200){employees[0] += 1;}
            else if(income < 399 && income > 300){employees[1] += 1;}
            else if(income < 499 && income > 400){employees[2] += 1;}
            else if(income < 599 && income > 500){employees[3] += 1;}
            else if(income < 699 && income > 600){employees[4] += 1;}
            else if(income < 799 && income > 700){employees[5] += 1;}
            else if(income < 899 && income > 800){employees[6] += 1;}
            else if(income < 999 && income > 900){employees[7] += 1;}
            else if(income > 1000)               {employees[8] += 1;}
            
        }
        
        System.out.printf("\n \nSalary Bracket\tAmount in Bracket\n");
        for(int i = 0; i < employees.length-1; i++){
            System.out.printf("$" + low + "-$" + high + "\t \t" + employees[i] + "\n");
            low += 100; high += 100;
        }
        System.out.printf("$" + low + " and over\t\t" + employees[8] + "\n");
    }
    
}
