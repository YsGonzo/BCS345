/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2module;

import java.util.Scanner;

/**
 *
 * @author itlabs
 */
public class InvoiceTest {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Invoice manager = new Invoice();
    
    System.out.print("Choose the quantity of what you're buying:" );
    int newPurchaseQuantity = keyboard.nextInt();
    System.out.print("Choose the price of what you're buying:" );
    int newPricePerItem = keyboard.nextInt();
    
    manager.setPurchaseQuantity(newPurchaseQuantity);
    manager.setPricePerItem(newPricePerItem);
    
    System.out.printf("Your invoice amount is: $" + 
            manager.getInvoiceAmount() + "\n");
    }
}