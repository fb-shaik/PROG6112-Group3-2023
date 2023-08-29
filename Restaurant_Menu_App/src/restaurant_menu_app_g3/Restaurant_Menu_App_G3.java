
package restaurant_menu_app_g3;

import javax.swing.*; //Joptionpane
import java.util.ArrayList; //This is for the arrayList
import java.util.Collections;

public class Restaurant_Menu_App_G3 {

    public static void main(String[] args) {
//Display a welcome message
JOptionPane.showMessageDialog(null,"Welcome to the Menu App");
//Display the set of instructions
JOptionPane.showMessageDialog(null, "To set-up your menu, enter the menu items one by one. " +
        "Type 'zzz' to finish entering menu items.\n" +
        "After entering all menu items, you can check if a specific dish is available on today's menu listing"
        );
//Create an arrayList to store the menu items
//ArrayList<dataType> arrayListName = new ArrayList<>();
ArrayList<String> menuChoices = new ArrayList<>();
String entry, menuString = "";

//Loop to input menu items
//do-while loop 
do {
        //prompt the user to enter a menu item or 'zzz' to finish
        entry = JOptionPane.showInputDialog(null, "Enter an item for today's menu or type 'zzz' to finish");
        if(!entry.equalsIgnoreCase("zzz")){
                //Add the entered menu item to the ArrayList & menuString
                menuChoices.add(entry);
                menuString += entry+"\n";
        }
}while(!entry.equalsIgnoreCase("zzz"));

//Display the sorted menu
Collections.sort(menuChoices);
menuString = String.join("\n",menuChoices); //Convert the arrayList to a string for display purposes
JOptionPane.showMessageDialog(null, "Todays' menu choices are: \n" + menuString);

boolean itemAvailable = false;
while(!itemAvailable){
    //Prompt the user to enter a dish to check its availability
    String selectedDish = JOptionPane.showInputDialog(null, "Please enter a dish to check availability");
   //search for the user's selected dish in the sorted menu choices
   int index = Collections.binarySearch(menuChoices, selectedDish);
   //display availability message based on the search result
   if(index>=0){
       JOptionPane.showMessageDialog(null, selectedDish + " is an excellent choice!");
       itemAvailable = true;
}else {
            int choice = JOptionPane.showConfirmDialog(null,selectedDish + " is not available today "+
                    " Do you want to check another dish? ", "Dish not available", JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"Thanks for using the Menu App! ");
                    System.exit(0);
            }
   }
}
        
        
    }
    
}
