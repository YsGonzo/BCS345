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
public class evenOrOdd {
    private int[] numList;
    
    public void checkList(int quantity){
        Scanner keyboard = new Scanner(System.in);
        numList = new int[quantity];
        for(int i = 0; i < quantity; i++){
            numList[i] = keyboard.nextInt();
            System.out.print(isEven(numList[i]) + "\n");
        }
    }
    public boolean isEven(int n){
        return n % 2 == 0;
}
}
