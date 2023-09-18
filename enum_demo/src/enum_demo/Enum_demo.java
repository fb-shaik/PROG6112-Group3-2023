
package enum_demo;

public class Enum_demo {

    enum Size { 
   SMALL, MEDIUM, LARGE, EXTRALARGE 
        }
    //Here, we have created an enum named Size. It contains fixed values SMALL, MEDIUM, LARGE, and EXTRALARGE.
    //These values inside the braces are called enum constants (values).
    //The enum constants are usually represented in uppercase.
    


    
    public static void main(String[] args) {
  
      System.out.println(Size.SMALL); //enum name to access the constant values.
      System.out.println(Size.MEDIUM);
      Order o1 = new Order(Size.EXTRALARGE);
        o1.orderPizza();
   }
}

            
 public void orderPizza() {
     Enum_demo.Size pizzaSize = null;
   switch(pizzaSize) {
     case SMALL:
       System.out.println("I ordered a small size pizza.");
       break;
     case MEDIUM:
       System.out.println("I ordered a medium size pizza.");
       break;
     default:
       System.out.println("I don't know which one to order.");
       break;
   }
 }
}