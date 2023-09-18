/*Concrete class, which extend from the FoodItem class
Provide implementation for the abstract getType() method to specify the 
type of food item
 */
package foodorderingapp_abstract_g3;

//Subclass extends from AbstractParentClass (extend invoke the inheritance aspect)
public class Burger extends FoodItem {

    public Burger(String name, double price) {
        super(name, price);
    }

   //this is the implementation of the abstract method via the concrete child class
    @Override
    String getType() {
        return "Burger";
    }
    
}
