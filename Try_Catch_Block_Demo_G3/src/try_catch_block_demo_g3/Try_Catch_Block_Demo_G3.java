
package try_catch_block_demo_g3;

public class Try_Catch_Block_Demo_G3 {

    /*
    Try-Catch Block: used to handle exceptions in Java
    Syntax:
    try{
    //code that is normally to occur
    }
    catch(Exception e){
    //code to handle the exception that has occured
    }
    finally{
        //finally block always executes; its is an optional aspect to add in
        //for every try block there can only be one finally block 
    }
    */
 
    public static void main(String[] args) {
        try {
            //code placed here is the normal run on the app
            //should this code generate an exception it will be passed/caught by the catch block below to handle
            int divideByZero = 25/0;
        System.out.println("The result of the above calculation is: " + divideByZero);
        }
        ////within the catch block create an instance of the Exception class (e: an instance of the Exception class)
        catch (ArithmeticException e){
            //provide a way to handle the exception caught/passed from the try-bloack 
            System.out.println("Arithmetic Exception => " + e.getMessage());
        }
        finally{
            System.out.println("This is a finally block, it will alwsys run (exception or no exception occurring). ");
        }
        
    }
    
}
