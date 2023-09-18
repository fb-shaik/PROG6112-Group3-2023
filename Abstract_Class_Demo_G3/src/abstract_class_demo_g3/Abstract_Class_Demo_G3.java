
package abstract_class_demo_g3;
public class Abstract_Class_Demo_G3 {

    public static void main(String[] args) {
    //Animal animal = new Animal();//we cannot create an animal object beacause the Parent class Animal is abstract
    
//create an instance of each child class
    Dog dog = new Dog(); //child class object & we can do this because the child class is a concrete class
    Goat goat = new Goat();
    Pig pig = new Pig();
    
    dog.setName("My dog Spike");
    goat.setName("My goat Larry");
    pig.setName("My pig Piglet");
    
        System.out.println(dog.getName() + " says ");
        dog.sound(); //implementation of the abstract method via the concrete child version of the method body
        
        System.out.println(goat.getName() + " says ");
        goat.sound();//implementation of the abstract method via the concrete child version of the method body
        
        System.out.println(pig.getName() + " says ");
        pig.sound();//implementation of the abstract method via the concrete child version of the method body
    
    }
    
}
