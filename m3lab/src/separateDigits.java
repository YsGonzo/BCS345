/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author jayso
 */
public class separateDigits {
    public static int Quotient (int num, int div) {
        return num/div;
    }
    
    public static int Remainder (int num, int div) {
        return num % div;
    }
    
    public static void displayDigits(int n){
        int div = 10000;
        while (n != 0){
            if(Quotient(n, div) != 0){ 
               System.out.printf(Quotient(n, div) + "  ");
                n = Remainder(n, div);
            }
            div /= 10;
        }
        
    }

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       
       System.out.printf("Input digit: ");
       int num = keyboard.nextInt();
       
       System.out.println("New Format Below");
       displayDigits(num);
    }
}
