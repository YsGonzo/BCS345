
package calculatesales;
import java.util.Scanner;
/**
 *
 * @author jayso
 */
public class CalculateSales {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double total = 0;
        int count = 1;
        int prodNum;
        
        System.out.println("Choose which product you would like to buy (1-5).");
        
        while (count <= 5){
            prodNum = keyboard.nextInt();
            if (prodNum > 5 || prodNum < 1){
                System.out.println("Try Again");
            }
            else if(prodNum == 1){
                count++;
                total += 2.98;
            }
            else if(prodNum == 2){
                count++;
                total += 4.50;
            }
            else if(prodNum == 3){
                count++;
                total += 9.98;
            }
            else if(prodNum == 4){
                count++;
                total += 4.49;
            }
            else if(prodNum == 5){
                count++;
                total += 6.87;
            }
            if (count <= 5) {
                System.out.println("Choose another product (1-5).");
            }
        }
        System.out.printf("The total is: %.2f", total);
        
        
        
    }
    
}
