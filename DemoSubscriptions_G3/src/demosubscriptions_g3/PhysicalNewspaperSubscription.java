
package demosubscriptions_g3;
//This is a child class of the NewspaperSubscription Parent Class
//It will inherit all the fields & methods, even the abstract methods
//It will behave as a concrete class meaning we can create objects directly from this class

public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    
    //Implementation of the abstract method in the Parent Class is provided here through the child class's version
    //of the method. The child class will provide a method body
    @Override
    public void setAddress(String s)
    { boolean hasDigit = false;  //check to see if the user provides a physical number for the physical address
     address = s;
     for(int x = 0;  x < s.length();  ++x)
        
            if(Character.isDigit(s.charAt(x)))
                            hasDigit = true;
             if(hasDigit)
                    rate = 15.00;
             else{
                    rate = 0.0;
                    System.out.println("\nAddress must contain a digit  ");
             }
        
            
    
    }
    
}
