
package placeanorder;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {
       final int HIGHITEM = 9999; //Maximum value for the item
       final int HIGHQUAN = 12; //Maximum quantity allowed
       int code; //Variable to hold the current code for error messages
       int x; //loop control variable
       boolean found; 
       
       //ITEM & PRICE arrays to hold the item codes & corresponding prices
       final int [] ITEM = {111,222,333,444};
       final double [] PRICE = {0.89, 1.47, 2.43, 5.99};
       
       //variable to hold user prompt & inputs
        int item;
        int quantity;
        double price = 0;
        double totalPrice = 0;
        
Scanner input = new Scanner(System.in);
       //try-catch 
       //will prompt the user for item & quantity
       //check to see if all values entered are acceptable
       //if not call the message required that matched the error seen
       //if all is good, capture the user inputs & calculate the total 
        try {
            code = 0;
            System.out.print("Enter item number ");
            item = input.nextInt();   // Read item number from user
            
            code = 1;
            System.out.print("Enter quantity ");
            quantity = input.nextInt();  // Read quantity from user

            // Check for invalid item numbers
            code = 2;
            if (item < 0)
                throw (new OrderException(OrderMessages.message[code]));
            
            code = 3;
            if (item > HIGHITEM)
                throw (new OrderException(OrderMessages.message[code]));
            
            // Check for invalid quantity values
            code = 4;
            if (quantity < 1)
                throw (new OrderException(OrderMessages.message[code]));
            
            code = 5;
            if (quantity > HIGHQUAN)
                throw (new OrderException(OrderMessages.message[code]));
            
            // Check if the provided item exists in the list
            found = false;
            for (x = 0; x < ITEM.length; ++x)
                if (item == ITEM[x]) {
                    found = true;
                    totalPrice = PRICE[x] * quantity;
                    totalPrice *= 100;
                    int temp = (int) totalPrice;
                    totalPrice = temp / 100.0;
                    price = PRICE[x];
                    x = ITEM.length;   // Exit loop once item is found
                }
            
            // If item is found, display the total order price
            if (found) {
                System.out.println("Order OK. Total is $" + totalPrice +
                                   "\n  (" + quantity + " at $" + price + " each)");
            } else {
                // If item is not found, throw an exception
                code = 6;
                throw (new OrderException(OrderMessages.message[code]));
            }
        } catch (Exception ex) {
            // Display error message if any exception is thrown
            System.out.print("Message is: ");
            System.out.println(ex.getMessage());
        }
    }
}
  
