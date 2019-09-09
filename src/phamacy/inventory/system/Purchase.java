
package phamacy.inventory.system;

import java.util.*;

public class Purchase extends Staff{
    Staff staff1 = new Staff();
    Scanner input = new Scanner(System.in);
    public Date datetime;
    public int choice, quantity;
  
    public int deductProductQuantity(){
        return quantity --;
    }
    
    public int confirmPurchase(){
        System.out.println("Do you want to purchase more?");
        System.out.println("1 - Yes; 2 - No");
        choice = input.nextInt();
        
        switch (choice) {
            case 1:
                enterProductName();
                break;
            case 2:
                System.out.println("Thank you!");
                break;
            default:
                System.out.println("Input Error!");
                break;
        }
        return choice;
    }
}

