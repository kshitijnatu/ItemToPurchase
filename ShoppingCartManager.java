/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package itemtopurchase;

import java.util.Scanner;

/**
 *
 * @author kshit
 */
public class ShoppingCartManager {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        
        System.out.print("Enter customer's name: ");
        String custName = input.nextLine();
        cart.setCustomerName(custName);
        
        System.out.println("Press enter to store the items you want in your cart");
        String response = input.nextLine();
        while(!response.equalsIgnoreCase("q")){
            System.out.print("What is your item name: ");
            String name = input.nextLine();
            System.out.print("Describe your item: ");
            String descrip = input.nextLine();
            System.out.print("What is the item's price: ");
            int price = input.nextInt();
            input.nextLine();
            System.out.print("How much of the item do you want: ");
            int quantity = input.nextInt();
            input.nextLine();
            
            ItemToPurchase item = new ItemToPurchase(name, descrip, price, quantity);
            cart.addItem(item);
            System.out.println("Item successfully added!");
            System.out.println();
            System.out.println("Do you want to stop? Hit 'q' to stop or press enter to keep going");
            response = input.nextLine();
        }
        cart.printDescriptions();
        
        System.out.print("Do you want to remove more items to your cart? (y/n): ");
        response = input.nextLine();
        while(response.equalsIgnoreCase("y")){
            System.out.print("Which item do you want to remove: ");
            String itemRemove = input.nextLine();
            cart.removeItem(itemRemove);
            System.out.print("Do you want to remove more items? (y/n)");
            response = input.nextLine();
        }
        System.out.println();
        cart.printTotal();
    }
    
}
