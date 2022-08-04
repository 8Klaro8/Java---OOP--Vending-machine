import java.util.Arrays;
import java.util.Scanner;

import javax.management.loading.MLetContent;
import javax.sql.rowset.serial.SerialRef;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");


        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };

        // Setting up machine
        Machine machine = new Machine(items);
        System.out.println(machine);

        int continueInput = 1;
        while (continueInput == 1){
            // Getting user input
            System.out.println("Pic a row: ");
            int selectedRow = scan.nextInt();
            scan.nextLine();
            System.out.println("Pic a row: ");
            int selectedSpot = scan.nextInt();
            scan.nextLine();

            // Dispnese drink
            if (machine.dispense(selectedRow, selectedSpot)){
                System.out.println("Enjoy your drink!");
                System.out.println("\n" + machine);

            }
            else{
                System.out.println(machine.getItem(selectedRow, selectedSpot).getName() + " is currently out of stock." +
                " Press '1' to purchase an other.");
                continueInput = scan.nextInt();
            }
        }
    }
}
