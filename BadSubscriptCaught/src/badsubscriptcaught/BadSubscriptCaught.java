
package badsubscriptcaught;

import java.util.*;
public class BadSubscriptCaught {


    public static void main(String[] args) {
        //Array of Names
        String [] names ={"Jack", "Jane", "Joe", "Jill", "Fred", "Frankie", "Bill", "Henry"};
        
        //create an instance of the Scanner class to capture user input
        Scanner keyboard = new Scanner(System.in);
      int number; //variable to hold the user input
      
//try-catch block that will check the user input & retrieve the corresponding name
//throws an exception when the user requests an index that does not exist

try{
        //prompt the user for a number
        System.out.println("Enter a number & I will display the corresponding name: ");
        number = Integer.parseInt(keyboard.nextLine());
        
        //try to access the name based on the specified index & display
        System.out.println("Name is: " + names[number]);
}
catch (ArrayIndexOutOfBoundsException e){
        //handle the exception if the index is out of bounds
        System.out.println("Subscript out of range! ");
}
        
    }
    
}
