
package foodorderingapp_abstract_g3;

public class FoodOrderingApp_Abstract_G3 {

    public static void main(String[] args) {
//create an instance of each child class
FoodItem pizza = new Pizza("Veggie Pizza", 20.99); 
//Upcasting to build the child class object via the abstract Parent class
FoodItem burger = new Burger("Cheese-burger", 25.99);
FoodItem pasta = new Pasta ("Veggie Pasta", 15.99);
FoodItem steak = new Steak ("Fillet Steak", 149.99);

//display the above information that has been set via the parameterized constructor
System.out.println(" Food Items on Offer: ");
displayFoodItemDetails(pizza);
displayFoodItemDetails(burger);
displayFoodItemDetails(pasta);
displayFoodItemDetails(steak);
    }
    
    //display method
                                                                                      //(Classname objectName)
    private static void displayFoodItemDetails(FoodItem item){
        System.out.println("Type: " + item.getType());
        System.out.println("Name: " + item.getName());
        System.out.println("Price: " + item.getPrice());
        System.out.println();
    }
    
}
