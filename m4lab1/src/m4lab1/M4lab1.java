/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m4lab1;

/**
 *
 * @author itlabs
 */
public class M4lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] counts = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < counts.length-1; i++){
            counts[i] = 0;
            System.out.print(counts[i]);
        }
        System.out.print("\n");
        
        
        int[] bonus = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int i = 0; i < bonus.length; i++){
            bonus[i] += 1;
            System.out.println(bonus[i]);
        }
        System.out.print("\n");
        
        
        int[] bestScores = {1,2,3,4,5};
        for(int i = 0; i < bestScores.length; i++){
            System.out.printf(bestScores[i] + " | ");
        }
        System.out.print("\n");
    }
    
}
