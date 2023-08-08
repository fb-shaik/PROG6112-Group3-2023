package rainbow.g3;
import javax.swing.*; // (*) represents a wildcard operator; allows for full access to the Swing library


public class RainBowG3 {

    public static void main(String[] args) {
        //display a welcome message
        JOptionPane.showMessageDialog(null, " Welcome to the Rainbow App ");
      int numColours = getNumberOfColours(); // Step 1: Get the number of colors from the user
        

        String[] colours = getColours(numColours); // Step 2: Get color names from the user
        displayRainbow(colours); // Step 3: Display the rainbow colors
        
        JOptionPane.showMessageDialog(null,"Good-Bye");
    
    }

// This method prompts the user to enter the number of colors they want to use in the rainbow.
// It uses a while loop to ensure that the user is repeatedly prompted until a valid input is provided.
public static int getNumberOfColours() {
    while (true) {
        // Prompt user for value (3 & 7)
        String input = JOptionPane.showInputDialog("How many colors do you want to use in the rainbow? (3-7):");
        
        // Check if the input is a valid integer using the isInteger() method
        if (isInteger(input)) {
            // If the input is a valid integer, convert it to an int
            int numColours = Integer.parseInt(input);
            
            // Check if the integer is within the specified range (3 to 7)
            if (numColours >= 3 && numColours <= 7) {
                // If the input is within the range, return the validated number of colors
                return numColours;
            } else {
                // If the input is outside the range, display an error message
                JOptionPane.showMessageDialog(null, "Please enter a number between 3 and 7.");
            }
        } else {
            // If the input is not a valid integer, display an error message
            JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
        }
    }
}

// This method checks if the given string input is a valid integer.
// It returns true if the input consists only of digits and false otherwise.
public static boolean isInteger(String input) {
    // Check if the input is null or empty, which means it is not a valid integer
    if (input == null || input.isEmpty()) {
        return false;
    }

    // Iterate through each character in the input string
    for (char c : input.toCharArray()) {
        // Check if the character is a digit using Character.isDigit() method
        // If it is not a digit, the input is not a valid integer, so return false
        if (!Character.isDigit(c)) {
            return false;
        }
    }

    // If all characters are digits, the input is a valid integer, so return true
    return true;
}

    
    //method that will make use/create the Array; prompt the user for their colour choices 
     public static String[] getColours(int numColours) {
        String[] colours = new String[numColours]; // Create an array to store the colors
        //Loop used to store input in the respective array subscripts
        for (int i = 0; i < numColours; i++) {
            // Prompt the user for each color
            colours[i] = JOptionPane.showInputDialog("Enter colour " + (i + 1) + ":"); 
        }
        return colours; // Return the array of colours
    }
    
   //display method that will call the Array of Colours 
     public static void displayRainbow(String[] colours) {
        StringBuilder message = new StringBuilder("Rainbow Colours:\n"); // Create a string to store the output message
        for (int i = 0; i < colours.length; i++) {
            message.append(i + 1).append(". ").append(colours[i]).append("\n"); // Append each colour to the message
        }
        JOptionPane.showMessageDialog(null, message.toString()); // Display the message using JOptionPane
    }
    
    
}


