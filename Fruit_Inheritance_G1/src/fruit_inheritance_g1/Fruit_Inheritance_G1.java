
package fruit_inheritance_g1;


public class Fruit_Inheritance_G1 {

    public static void main(String[] args) {
    //Create an array of Fruit objects
    Fruit [] fruits = new Fruit[2];
    
    //Populate the array with an instance of the child Apple & Banana class
    fruits[0] = new Apple("Honecycrisp", "Red");
    fruits[1] = new Banana("Cavendish", "Yellow");
    
    //Iterate throught the array & call the taste() method
    for(Fruit fruit : fruits){
        System.out.println("Fruit: ");
        fruit.taste();//Dynamic binding selects the appropriate taste() method at runtime
        System.out.println();
    }
    }
}
