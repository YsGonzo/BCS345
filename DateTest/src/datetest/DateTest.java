/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetest;
import java.util.Scanner;
/**
 *
 * @author itlabs
 */
public class DateTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Date today = new Date();
        
        System.out.print("Enter the month, then day, then year: ");
        int month = keyboard.nextInt();
        int day = keyboard.nextInt();
        int year = keyboard.nextInt();
        
        System.out.printf("The date is: ");
        today.displayDate(month, day, year);
        
    }
}