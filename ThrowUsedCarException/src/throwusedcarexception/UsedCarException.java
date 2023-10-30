
package throwusedcarexception;

//When using the built in Exception Class we are able to create custom exceptions for our app
//invoked via inheritance 
public class UsedCarException extends Exception {
    
    //constructor for the UsedCarException class that takes a message as a parameter
    public UsedCarException(String s){
        //Calls the constructor of the parent Exception Class 
        super(s);
    }
    
}
