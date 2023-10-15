
package zoo_application_interface;

public class Penguin implements Animal {
//Penguin is a child class & will implement the interface Animal Class 
    @Override
    public void speak() {
        System.out.println("Penguin: Squawk!");
    }

    @Override
    public void eat() {
        System.out.println("Penguin: Eating Fish");
    }
    
}
