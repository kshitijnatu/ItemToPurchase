package itemtopurchase;

/**
 *
 * @author kshit
 */
public class ItemToPurchase {
    private String itemName, itemDescription;
    private int itemPrice, itemQuantity;

    public ItemToPurchase() {
        itemName = "";
        itemPrice = 0;
        itemQuantity = 0;
    }
    
    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
    
    
    public String getName(){
        return itemName;
    }
    public void setName(String itemName){
        this.itemName = itemName;
    }
    public int getPrice(){
        return itemPrice;
    }
    public void setPrice(int itemPrice){
        this.itemPrice = itemPrice;
    }
    public int getQuantity(){
        return itemQuantity;
    }
    public void setQuantity(int itemQuantity){
        this.itemQuantity = itemQuantity;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public void printItemCost(){
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemPrice * itemQuantity));
    }
    public void printItemDescription(){
        System.out.println(itemName + ": " + itemDescription);
    }



    
}
