
package phamacy.inventory.system;

import java.util.*;

public class PhamacyInventorySystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice1, choice2;
        
        Staff staff1 = new Staff();
        Purchase purchase1 = new Purchase();
        Product product1 = new Product();
       
        System.out.println("Welcome");
        System.out.println("Thank you for using Phamarch Inventory System.");
        System.out.println();
      
        do{
        System.out.println("1 - Create a purchase");
        System.out.println("2 - Search products");
        System.out.println("3 - Key in products' name");
        System.out.println("4 - Check stock");
        System.out.print("Please choose a function to run:");
        choice1 = input.nextInt();
        
            switch (choice1) {
                case 1:
                    staff1.createPurchase();
                    break;
                case 2:
                    staff1.searchProduct();
                    break;
                case 3:
                    staff1.enterProductName();
                    purchase1.confirmPurchase();
                    break;
                case 4:
                    product1.confirmProductAvailability();
                default:
                    System.out.println("Input Error! Please try again.");
                    break;
            }
        System.out.println("Do you want to continue?");
        System.out.println("1 - YES; 2 - NO");
        choice2 = input.nextInt();
        }while(choice2 == 1);       
        System.out.println("Thank you for using our system.");
        System.out.println("See you next time.");
    }
}
