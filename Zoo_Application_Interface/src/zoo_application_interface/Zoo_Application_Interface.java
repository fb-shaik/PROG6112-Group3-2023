
package zoo_application_interface;

public class Zoo_Application_Interface {
//demonstrate the use of the interface Animal Parent class via child class objects (Lion, Elephant, Penguin)
    public static void main(String[] args) {
        //Created an instance of the different animals
        //Upcasting: ParentClassName objectName = new ChildClassName(); 
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal penguin = new Penguin();
        
        //Make of the interface
        System.out.println("Welcome to the Zoo! ");
        System.out.println("\n---- Lion ---");
        lion.speak();
        lion.eat();
        System.out.println("\n---- Elephant ---");
        elephant.speak();
        elephant.eat();
        System.out.println("\n---- Penguin ---");
        penguin.speak();
        penguin.eat();
        
        
    }
    
}
