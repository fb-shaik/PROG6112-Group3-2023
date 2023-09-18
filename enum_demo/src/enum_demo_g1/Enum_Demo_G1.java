package enum_demo_g1;
//Simple app to illustarte the enumeration concept
import javax.swing.*; 
 
//syntax to declare an enum
//enum enumName {Enum-Value, Enum-Value,Enum-Value,Enum-Value} *Enum-Values should be uppercase letters
enum Size {SMALL, MEDIUM, LARGE, EXTRALARGE}

public class Enum_Demo_G1 {

    public static void main(String[] args) {
        
        while (true)
        {//Display a welcome message using JOptionPane
            JOptionPane.showMessageDialog(null,"Welcome to PizzaHut");
                
         //Create a string of the available pizza sizes
        String availableSizes = " Available sizes: SMALL, MEDIUM, LARGE, EXTRA-LARGE";
        //Display the available sizes using JOptionPane
        JOptionPane.showMessageDialog(null, availableSizes, "Avaialable Sizes", JOptionPane.INFORMATION_MESSAGE);
        //Prompt the user to enter the pizza size choice, include option to exit the program as well; 
        String sizeInput = JOptionPane.showInputDialog(null, "Enter the size of pizza you wish to order, or type 'exit' to quit");
       if(sizeInput == null || sizeInput.equalsIgnoreCase("exit"))
       {
                    JOptionPane.showMessageDialog(null, "Thank you for using the PizzaHut ordering system, Goodbye!");
       
            } else {
                try {
                    Size chosenSize = Size.valueOf(sizeInput.toUpperCase());
                    Pizza pizza = new Pizza(chosenSize);
                    String orderMessage = pizza.orderPizza();
                    JOptionPane.showMessageDialog(null, orderMessage);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, "Invalid pizza size choice"); // Handle an invalid input
                }
            }
        }}}

/*
Enumerations are a fixed set of constants
Treated as a special data-type 
Enumetrations are treated as objects of the enum type
Written in uppercase letters & accessed via the dot operator
EnumType.EnumValue
*/