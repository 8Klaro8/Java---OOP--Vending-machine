import java.rmi.server.RemoteStub;

public class Item {
    private String name;
    private double price;
    private int quantity;


    // Constructor
    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
}

    // Get
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }

    //Set
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    // Copy constructor
    public Item(Item source){
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }

    //toString method
    public String toString(){
        // return "\nObject's items:\n---------------\n" + "Name: "  + this.name + "\n" +
        //                               "Price: " + this.price + "\n" +
        //                               "Quantity: (" + this.quantity + ")\n";

        return this.name + ": " + this.price + " (" + this.quantity + ")";
    }
}



