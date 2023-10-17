
package simpleexceptionhandlingapp_g3;
import java.util.*;

public class SimpleExceptionHandlingApp_G3 {
    
    public static void main(String[] args) {
        //Create a scanner object to reac the user input
        Scanner scanner = new Scanner(System.in);
        
        //Prompt the user for two numbers
        System.out.println("Enter the numerator: ");
        int numerator = scanner.nextInt();
        System.out.println("Enter the denominator: ");
        int denominator = scanner.nextInt();
        
        //close the scanner to free up resources
        scanner.close();
        
        try{
        //Attempt to divide the numerator by the denominator
        int result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){
            //Handle the ArithmeticException (divide by zero)
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    //method that performs the division & checks if an exception should be thrown when it occurs.
    public static int divideNumbers (int numerator, int denominator){
    //check if the denominator is zero
    if(denominator == 0){
            //if the denominator is zero, throw an Arithmetic Exception
            throw new ArithmeticException("Division by zero is not allowed.");
    }
        //perform the division because the denominator is not zero
    return numerator/denominator; 
    }
}
