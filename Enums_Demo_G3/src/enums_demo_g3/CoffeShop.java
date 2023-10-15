
package enums_demo_g3;

/**
 *
 * Syntax: enum enumName{fixedVal1, fixedVal2, fixedVal3};
 * fixedValues are always in UpperCase letters
 */

enum CoffeeSizes{SMALL, MEDIUM, LARGE}

public class CoffeShop {
    
    CoffeeSizes size; //created an enum object 
    
    public CoffeShop(CoffeeSizes size){
    this.size = size;
    }
    
    public void placeOrder(){
    switch(size){
        case SMALL: 
            System.out.println("This coffee order should be a small");
            break;
        case MEDIUM:
            System.out.println("This coffee order should be a medium");
            break;
        case LARGE:
            System.out.println("This coffee order should be a large");
            break;
    }
    }
    }
    
    
    
    
   
    

