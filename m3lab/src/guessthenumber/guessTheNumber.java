/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumber;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jayso
 */
public class guessTheNumber {
    
    
    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int randNum = r.nextInt(1000);
        
        System.out.println("Guess a number between 1 and 1000.");
        int num = keyboard.nextInt();
        
        
        while(num > 1000 || num < 1) {
            System.out.println("Try Again. Input a number between 1 and 1000.");
            num = keyboard.nextInt();
        }
        
        while(num != randNum){
            if(num < randNum){
                System.out.println("Too low. Try again.");
                num = keyboard.nextInt();
            }
            else if(num > randNum){
                System.out.println("Too high. Try again.");
                num = keyboard.nextInt();
            }
        }
        if(num == randNum){
                System.out.println("Congratulations. You guessed the number!");
            }
        
    }
}
