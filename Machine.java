import java.util.Arrays;

public class Machine {
    
    private Item[][] items = new Item[3][3];
    
    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */

    public boolean dispense(int row, int spot){
        int quantityOfRequestedItem = this.items[row][spot].getQuantity();
        if (quantityOfRequestedItem > 0){
            // Dispense
            quantityOfRequestedItem--;
            this.items[row][spot].setQuantity(quantityOfRequestedItem);
            return true;
        }
        
        return false;
    }


    // Constructor
    public Machine(Item[][] items){
        this.items = Arrays.copyOf(items, items.length);

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length; j++) {
                Item myNewItemToCopy = new Item(items[i][j]);
                this.items[i][j] = myNewItemToCopy;
            }
        }
    }

    // Get
    public Item getItem(int row, int spot){
        return this.items[row][spot];
    }

    // Set
    public void setItems(Item item, int row, int spot){
        // Copy item
        this.items[row][spot] = new Item(item);
    }

    public String toString(){
        String temp = "";
       for (int i = 0; i < items.length; i++) {
            temp += "\t ";
         for (int j = 0; j < items.length; j++) {
            temp += items[i][j];
         }
         temp += "\n";
       }
       temp += "\n\t************************************************";
       return temp;
    }
}
