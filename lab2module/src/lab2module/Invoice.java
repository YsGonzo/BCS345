/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2module;

public class Invoice {
    // Instance Variables
    public String partNum;
    public String partDesc;
    public int purchaseQuantity;
    public int pricePerItem;
    
    // Setters
    public void setPartNum(String newPartNum) {
        this.partNum = newPartNum;
    }
    public void setPartDesc(String newPartDesc) {
        this.partDesc = newPartDesc;
    }
    public void setPurchaseQuantity(int newPurchaseQuantity) {
        this.purchaseQuantity = newPurchaseQuantity;
    }
    public void setPricePerItem(int newPricePerItem) {
        this.pricePerItem = newPricePerItem;
    }
    
    // Getters
    public String getPartNum() {return partNum;}
    public String getPartDesc() {return partDesc;}
    public int getPurchaseQuantity() {return purchaseQuantity;}
    public int getPricePerItem() {return pricePerItem;}
    
    // Constructors
    public Invoice() {
        partNum = "0A";
        partDesc = "New Part";
        purchaseQuantity = 1;
        pricePerItem = 100;
    }
    
    // Methods
    public double getInvoiceAmount() {
        double totalPrice = purchaseQuantity * pricePerItem;
        if (totalPrice < 0) {
            return 0;
        }
        else {
            return totalPrice;
        }
    }
}