package m4lab3;
import java.util.Scanner;

/**
 *
 * @author jayso
 */
public class M4lab3 {
    
    public static void assignFirstClass(boolean[] seats) {
            for(int i = 1; i < 6; i++){
                if(!seats[i]){
                    seats[i] = true;
                    System.out.printf("/*************Boarding Pass*************/\nseat " + i + " - First Class\n");
                   break;
                }
                else{
                    System.out.printf("First Class Seats are filled, Would you like to sit in Economy(2)?\n");
                    break;
                }
            }
    }
    
    public static void assignEconomy(boolean[] seats) {
            for(int i = 6; i < 11; i++){
                if(!seats[i]){
                    seats[i] = true;
                    System.out.printf("/*************Boarding Pass*************/\nseat " + i + " - Economy\n");
                }
                else{
                    System.out.printf("Economy Seats are filled, Would you like to sit in First Class(1)?\n");
                    break;
                }
            }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // seats[0] is not used for the purposes of this app. 
        // First-Class Section (seats 1-5), Economy Section (seats 6-10)
        boolean[] seats = {false, false, false, false, false, false, false, false, false, false, false};
        int seatType;
        
        System.out.print("Please choose between First Class (1) and Economy (2): ");
        seatType = keyboard.nextInt();
        
        if(seatType == 1){
            assignFirstClass(seats);
            assignFirstClass(seats);
        }
        else if(seatType == 2){
            assignEconomy(seats);
            assignEconomy(seats);
        }
        
    }
    
}
