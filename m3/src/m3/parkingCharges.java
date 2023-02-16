/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3;
import java.util.Scanner;

/**
 *
 * @author itlabs
 */
public class parkingCharges {
    public void calculate(int carsParked){
        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        
        String[] names = new String[carsParked];
        int[] hrs = new int[carsParked];
        
        // Name each car owner
        for(int i = 0; i < carsParked; i++){
            System.out.print("Enter the name of the car owner: ");
            names[i] = keyboard.next();
            System.out.print("How many hours is the car staying?: ");
            hrs[i] = keyboard.nextInt();
        }
        
        System.out.println("Name|Charges|Running Total");
        for(int j = 0; j < names.length; j++){
            double charges = 2.00;
            if(hrs[j] > 3){
                charges += ((hrs[j]-3)*.50);
                sum += charges;
                System.out.printf(names[j] + "\t" + charges + "\t" + sum + "\n");
                }
            else {
                sum += charges;
                System.out.printf(names[j] + "\t" + charges + "\t" + sum + "\n");
            }
            }
    }
}
