
package pettamagotchi_demo_g3;

public class PetTamagotchi_Demo_G3 {

    public static void main(String[] args) {
        //create an instance of the child class Dog, Cat, Bird, Unicorn
        
        //className objectName = new Constructor(parameters)
        //(String name, int age, String colour, int hunger, int happiness, int tiredness, boolean isClean)
        Dog dog = new Dog("Buddy", 2, "grey", 2,8,6,true);
        Cat cat = new Cat("Whiskers",5,"white",5,2,5,false);
        Bird bird = new Bird("Penny", 5,"yellow",6,7,3,true);
        Unicorn unicorn = new Unicorn("Rainbow", 2,"white",3,10,10,false); 
        
        //Method calls for the child classes
        System.out.println("My Pet: " + dog.getName());
        dog.feed();
        dog.sleep();
        dog.bath();
        dog.printStatus();
        
        System.out.println("\nMy Pet: " + cat.getName());
        cat.feed();
        cat.sleep();
        cat.bath();
        cat.printStatus();
        
                System.out.println("\nMy Pet: " + bird.getName());
        bird.feed();
        bird.sleep();
        bird.bath();
        bird.printStatus();
        
                System.out.println("\nMy Pet: " + unicorn.getName());
        unicorn.feed();
        unicorn.sleep();
        unicorn.bath();
        unicorn.printStatus();
        
        
    }
    
}
