
package paths_demo_g3;

import java.nio.file.*;
public class Paths_Demo_G3 {

    
    public static void main(String[] args) {
        //create an Path object to represent the file path
        Path path = Paths.get("C:\\Users\\fshai\\Desktop\\Chapter 13\\Data.txt");
        
        //Get the number of elements in the file path]
        int count = path.getNameCount();
        
        //Print out the original Path
        System.out.println("Path is: " + path.toString());
        
        //print the filename (last element in the path)
        System.out.println("File name is: " + path.getFileName());
        
        //print the number of elements in the path
        System.out.println("There are " + count + " elements in this file path. ");
        
    //Loop through & print each element in the path
    for (int x = 0; x <count; ++x)
            System.out.println("Element " + x + " is " + path.getName(x));
    }
    
}
