package phamacy.inventory.system;

import java.text.SimpleDateFormat;
import java.util.*;

public class Staff{
    Scanner input = new Scanner(System.in);
    public Date datetime;
    public int choice1, choice2, quantity, i;
    public double sum=0;
    public String staffid, name, purchaseID;
    
        Date dNow = new Date( );
        SimpleDateFormat ft = 
        new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a ");

    public String createPurchase(){
        System.out.println("Please enter your staff's name:");
        name = input.next();
        System.out.println("Please enter your staff's ID:");
        staffid = input.next();
        System.out.println("Enter Purchase ID:");
        purchaseID = input.next();
        return purchaseID; 
    }
    
    public int searchProduct(){
        System.out.println("1 - ProductA");
        System.out.println("2 - ProductB");
        System.out.println("3 - ProductC");
        System.out.print("Enter the product name:");
        int choice1 = input.nextInt();
        
        switch (choice1){
            case 1:
                System.out.println("Name: Product A");
                System.out.println("Type: A");
                System.out.println("Code: 1234");
                System.out.println("Price: RM 10.00");
                break;
                
            case 2:
                System.out.println("Name: Product B");
                System.out.println("Type: B");
                System.out.println("Code: 1235");
                System.out.println("Price: RM 20.00");
                break;
                
            case 3:
                System.out.println("Name: Product C");
                System.out.println("Type: C");
                System.out.println("Code: 1236");
                System.out.println("Price: RM 30.00");
                break;
                
            default:
                System.out.println("Error, the product is not exist.");
                break;
        }
        return choice1;
    }
    
    public void enterProductName(){
        System.out.println("Enter the quantities of products:");
        quantity = input.nextInt();
        String [] product = new String[quantity];
        double[] value=new double[quantity];  
    
        for(i=0;i<quantity;i++){
        System.out.println("Products available:");
        System.out.println("ProductA, ProductB, ProductC");
        System.out.println("Enter the product name:");
        product[i]= input.next();
        System.out.println("Enter the price:");
        value[i] = input.nextDouble();
        sum+=value[i];
        }
        System.out.println("______________________________________");
        System.out.println("Receipt");
        System.out.println("Date/Time: " + ft.format(dNow));
        System.out.println("Items" + "               " + "Price");
        System.out.println("______________________________________");
        for(int i=0;i<quantity;i++){
            System.out.println(product[i] + "                 " + "RM "+value[i]);
        }
        System.out.println("______________________________________");
        System.out.println("Total"+"             "+"RM "+sum);
    }
   
}

