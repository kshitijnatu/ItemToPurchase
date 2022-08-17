package itemtopurchase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kshit
 */
public class ShoppingCart {
    private String customerName, currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public ShoppingCart() {
        customerName = "";
        currentDate = "January 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<ItemToPurchase> getCartItems() {
        return cartItems;
    }

    public String getCurrentDate() {
        return currentDate;
    }
    public void addItem(ItemToPurchase t){
        cartItems.add(t);
    }
    public void removeItem(String iName){
        boolean found = false;
        for(int i = 0; i < cartItems.size(); i++){
            String name = cartItems.get(i).getName();
            if(name.equalsIgnoreCase(iName)){
                found = true;
                cartItems.remove(i);
            }
        }
        if(!found){
            System.out.print("Item not found in cart");
        }
    }
    
    public void modifyItem(ItemToPurchase t){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Chnage the name of the item you want to change: ");
        String name = input.nextLine();
        t.setName(name);
        
        System.out.print("Chnage the item description: ");
        String descript = input.nextLine();
        t.setItemDescription(descript);
        
        System.out.print("Chnage the item price: ");
        int price = input.nextInt();
        t.setPrice(price);
        
        System.out.print("Chnage the item quantity: ");
        int quantity = input.nextInt();
        t.setQuantity(quantity);
    }
    
    public int getNumItemsInCart(){
        int total = 0;
        for(ItemToPurchase items : cartItems){
            total += items.getQuantity();
        }
        return total;
    }
    
    public int getCostOfCart(){
        int total = 0;
        for(ItemToPurchase items : cartItems){
            total += (items.getPrice() * items.getQuantity());
        }
        return total;
    }
    
    public void printTotal(){
        System.out.println(getCustomerName() + "'s Shopping Cart  - " + getCurrentDate());
        if(!cartItems.isEmpty()){
            int totalPrice = getCostOfCart();
            for(var items: cartItems){
                items.printItemCost();
                //totalPrice += (items.getPrice() * items.getQuantity());
            }
            System.out.println("Number of Items: " + getNumItemsInCart());
            System.out.println("Total: $" + totalPrice);
        }
        else{
            System.out.println("Shopping cart is empty");
        }   
    }
    
    public void printDescriptions(){
        System.out.println(getCustomerName() + "'s Shopping Cart  - " + getCurrentDate());
        System.out.println("Item Descriptions");
        for(var items : cartItems){
            items.printItemDescription();
        }
    }
}
