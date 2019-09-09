
package phamacy.inventory.system;

public class Product{
    public String name, code, type;
    public int quantity  = 50;
    public double price;
        
    public boolean confirmProductAvailability(){
        if(quantity != 0  ){
            System.out.println("The product is still available.");
            return(true);
        }
        else{
            System.out.println("The product is out of stock.");
            return(false);
        }
    }
    
    public int updateProductQuantity(){
        return quantity ++;
    }
}
