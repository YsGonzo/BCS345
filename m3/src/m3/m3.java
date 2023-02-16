/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3;
import java.util.Scanner;
/**
 *
 * @author Jayson Gonzalez
 */
public class m3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        parkingCharges app = new parkingCharges();
        
        System.out.print("Enter how many cars parked: ");
        int carsParked = keyboard.nextInt();
        app.calculate(carsParked);
    }
    
}
