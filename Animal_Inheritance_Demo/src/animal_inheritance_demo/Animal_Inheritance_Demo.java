package animal_inheritance_demo;
//Simple app to illustrate inheritance 
public class Animal_Inheritance_Demo {

    public static void main(String[] args) {
        //create an instance of the Animal (parent class)
        Animal animal = new Animal();
        animal.name = "Bob";
        animal.eat();
        animal.makeSound();
        
        //create an instance of the Dog Class (child class)
        Dog dog = new Dog();
        dog.name = "Spike";
        System.out.println("This is from the Dog (child) class");
        dog.sleep(); 
        dog.makeSound();
        
         //create an instance of the Cat Class (child class)
         Cat cat = new Cat();
         cat.name = "Fluffy";
         System.out.println("This is from the Cat (child) class");
         cat.eat();
         cat.makeSound();
        
       
    }
    
}
