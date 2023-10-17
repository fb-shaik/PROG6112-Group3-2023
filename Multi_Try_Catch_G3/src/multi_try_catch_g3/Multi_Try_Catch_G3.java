
package multi_try_catch_g3;

/*
Multi-catch block with a single try
This can be done when there are different exceptions that can be thrown
*/
import java.util.*;

public class Multi_Try_Catch_G3 {

    public static void main(String[] args) {
        //create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);
        try {//code that will occur when there is not exception/issue
                System.out.println("Enter an integer: ");
                int userInput = scanner.nextInt();
                System.out.println("You entered: " + userInput);
                
                int [] arr = {1,2,3}; //array with 3 values; subscript o-2
                System.out.println(arr[0]); //This will throw an array index out of bounds exception 
                
                double result = 10/100; //This will throw an arithmetic exception 
                System.out.println("Result: " + result);
        }
        catch(InputMismatchException e){
            System.out.println("Thats not a valid integer! ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds! ");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero! ");
        }
        catch(Exception e){
            //This is a general catch block for all other exceptions
            System.out.println("An unknown error: " + e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
    
}
