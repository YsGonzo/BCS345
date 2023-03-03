/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m4lab2;

/**
 *
 * @author itlabs
 */
public class M4lab2 {

    public static int product(int ... list){
        int sum = 1;
        
        for(int i:list){
            sum *= i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(product(2, 6, 10));
        System.out.println(product(2,3));
        System.out.println(product(20,10,5));
        
    }
    
}
