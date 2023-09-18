package foodorderingapp_abstract_g3;
/*
Abstract Class - FoodItem with a constructor that takes the
name & price of the food item. This class will serve as the blueprint
for specific food item child classes
 */
public abstract class FoodItem {
    private String name;
    private double price;
    
    //parameterized constructor 
    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //abstract method to get the type of food item
    //abstract method don't have a method body & a set of {}
    abstract String getType(); 

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    
}
