
package absolute_relative_path_g3;

import java.nio.file.*;
import java.util.Scanner;

public class Absolute_Relative_Path_G3 {

    public static void main(String[] args) {
        //Declare a variable to store the file name
        String name;
        //Create scanner object for user input
        Scanner keyboard = new Scanner(System.in);
        
        //Prompt the user to enter a file name
        System.out.println("Enter a file name: ");
        name = keyboard.nextLine();
        
        //Create a Path object from the user's input
        Path inputPath = Paths.get(name); //Paths is the helper method to use along with the Path object 
        System.out.println("Relative Path is: " + inputPath.toString());
        
        //convert to relative path to an absolute path
        Path fullPath = inputPath.toAbsolutePath();
        //Print the full (absolute path) to console
        System.out.println("Full Path is : " + fullPath.toString());
    }
    
}
