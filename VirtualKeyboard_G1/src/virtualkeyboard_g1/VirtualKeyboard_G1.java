
package virtualkeyboard_g1;
import java.util.*; //Scanner class to be used 
import java.io.IOException;

public class VirtualKeyboard_G1 {

    public static void main(String[] args) {
        
        //create a scanner object 
        Scanner input = new Scanner(System.in); //initialized a Scanner to read user input
         
        try{
        //code that is meant to run for the normal behaviour of the app
        
        //Attempt to execute the Windows on-screen keyboard utility
        Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32.\\osk.exe");
        }
         catch(IOException e){
         //code that will help the app recover should there be something out of the norm occur
         
         //If an exception (error) occurs during the execution of the osk.exe, print the error message
             System.out.println(e.getMessage());
         }
        //declare a String variable to store the user's name
        //String name; 
                //System.out.println("Enter name: "); //Display prompt for the user to enter their name
                //name = input.nextLine(); //Read the user's input & store in the name variable
         
              //  System.out.println("Hello, " + name + " ! "); //display back to user a greeting with name
         
    }
    
}
