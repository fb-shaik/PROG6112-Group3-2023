
package placeanorder;

//we are creating a custom exception named OrderException that will extend
//from the Java built-in Exception Class

//This class represents a custom exception for the order process
public class OrderException  extends Exception {
    
    //Constructore that accepts a string message
    public OrderException (String s)
    {//Call the super-class (Exception) constructor with the provided string
        super(s);
    }
    
}
