
package enums_demo_g3;

public class Enums_Demo_G3 {

  
    public static void main(String[] args) {
        // To use the enum, create an object from the class
        
    CoffeShop order123 = new CoffeShop(CoffeeSizes.SMALL);
    order123.placeOrder();
    
    CoffeShop order124 = new CoffeShop(CoffeeSizes.MEDIUM);
    order124.placeOrder();
    
    CoffeShop order125 = new CoffeShop(CoffeeSizes.LARGE);
    order125.placeOrder();
    
    }
    
}
