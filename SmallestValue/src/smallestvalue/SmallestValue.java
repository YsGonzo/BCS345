/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestvalue;
import java.util.Scanner;
/**
 *
 * @author itlabs
 */
public class SmallestValue {
    public static void smallestValue() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Choose Array Size: ");
        int n = keyboard.nextInt();
        int[] nums = new int[n];
        
        // Initialize array and fill elements to n.
        System.out.print("Fill Array: ");
        for(int i = 0; i < nums.length-1; i++){
            nums[n] = keyboard.nextInt();
        }
        int min = nums[0]; //Assigns minimum to index [0]
        
        // Find smallest number
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length-1; j++){
                if(nums[i] < nums[j]) {
                    min = nums[i];
                }
                System.out.println(min);
            }
        }
    }
    public static void main(String[] args) {
        smallestValue();
    }
}
