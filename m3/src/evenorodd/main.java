/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenorodd;
import java.util.Scanner;

/**
 *
 * @author jayso
 */
public class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        evenOrOdd app = new evenOrOdd();
        
        System.out.print("Enter how many digits will be checked: ");
            int amount = keyboard.nextInt();
            app.checkList(amount);
    }
}
