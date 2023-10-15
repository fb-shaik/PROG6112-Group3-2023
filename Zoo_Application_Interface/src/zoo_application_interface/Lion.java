
package zoo_application_interface;
//Lion is a concrete class; you can directly create objects for the Lion Class
//child class of the Parent Animal Class 
//Childclass implements behaviour from the interface Parent class

//childClassName implements (interface) ParentClassName
public class Lion implements Animal {

    @Override
    public void speak() {
        System.out.println("Lion: Roars!");
    }

    @Override
    public void eat() {
        System.out.println("Lion: Eating Meat");
    }
    
}
