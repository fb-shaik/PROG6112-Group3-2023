package foodorderingapp_abstract_g3;

public class Steak extends FoodItem {
   //Subclass extends from AbstractParentClass (extend invoke the inheritance aspect)             
    public Steak (String name, double price) {
        super(name, price);
    }

   //this is the implementation of the abstract method via the concrete child class
    @Override
    String getType() {
        return "Steak";
    }
    
}