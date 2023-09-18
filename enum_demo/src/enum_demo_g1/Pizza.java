
package enum_demo_g1;

public class Pizza {
    //Instance of the Size enumeration from the main class that can be used here
    Size pizzaSize; 
    
    //parameterized constructor to set pizza size 
    public Pizza(Size pizzaSize)
    {
        this.pizzaSize = pizzaSize; 
    }
    
    //Method orderPizza()
    //switch case that will make use of the enum
    public String orderPizza()
    {   //Use the switch case to determine the pizza size & return an appropriate message
            switch(pizzaSize)
            {   case SMALL:
                         return "You have ordered a small pizza";
                case MEDIUM:
                         return "You have ordered a medium pizza";
                case LARGE:
                          return "You have ordered a large pizza";
                case EXTRALARGE: 
                          return "You have ordered an extra-large pizza";
                default:
                           return "Invalid pizza size choice"; //Handle an invalid input
            }
            
        }
    
    }
        
        /*
        switch (expression){
        case value1: code that will run if the expression matches value1
        break;
        case value2: code that will run if the expression matches value2
        break;
        case value3: code that will run if the expression matches value3
        break;
        default: if nothing matched for the above cases
        }
*/