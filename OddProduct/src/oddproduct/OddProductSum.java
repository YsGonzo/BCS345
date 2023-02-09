/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddproduct;

/**
 *
 * @author jayso
 */
public class OddProductSum {

    // All numbers are 
    public static void main(String[] args) {
        int sum = 1;
       for(int i = 1; i < 16; i++) {
           if(i % 2 != 0) {
               sum *= i;
               System.out.println(sum);
           }
       }
    }
    
}
