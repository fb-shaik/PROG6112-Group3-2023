/*Simple app demo to the ArrayList & Array Class
 */
package arraylist_demo_g3;
//import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.*;

public class ArrayList_Demo_G3 {
    public static void main(String[] args) {

        // ArrayList using the import statement java.util.ArrayList
        ArrayList<String> stringList = new ArrayList<>();

        // populate the arrayList via JOptionPane
        for (int i = 0; i < 3; i++) {
            String input = JOptionPane.showInputDialog("Enter a fruit: ");
            stringList.add(input);
        }

        // Display the elements in the ArrayList using StringBuilder & JOptionPane
        StringBuilder stringListMessage = new StringBuilder("Elements of the stringList:\n");
        // For Each: for( datatype element : arrayName)
        for (String fruit : stringList) {
            stringListMessage.append(fruit).append("\n");
        }
        JOptionPane.showMessageDialog(null, stringListMessage.toString());

        // Adding more elements to the ArrayList
        stringList.add("grapes");
        stringList.add("mango");
        stringList.add("watermelon");

        // Update the message with the new elements
        stringListMessage = new StringBuilder("Updated elements of the stringList:\n");
        for (String fruit : stringList) {
            stringListMessage.append(fruit).append("\n");
        }
        JOptionPane.showMessageDialog(null, stringListMessage.toString());

        // Removing an element from the ArrayList
        stringList.remove("mango");

        // Update the message after removing an element
        stringListMessage = new StringBuilder("Final elements of the stringList:\n");
        for (String fruit : stringList) {
            stringListMessage.append(fruit).append("\n");
        }
        JOptionPane.showMessageDialog(null, stringListMessage.toString());
    }
}
       
        /*
//use the Array Class
        int [] intArray = new int[5];
        //Fill the array using JOptionPane
        for(int i = 0; i<intArray.length; i++)
        {
                String input = JOptionPane.showInputDialog("Enter a value for index " + i + " : ");
                intArray[i] = Integer.parseInt(input);
        }
        
        //Display the above captured user input via StringBuilder
        StringBuilder intArrayMessage = new StringBuilder ("Elements of the intArray:\n");
        for(int i = 0; i<intArray.length; i++){
            intArrayMessage.append(intArray[i]).append("\n");
        }
            JOptionPane.showMessageDialog(null,intArrayMessage.toString());
            */