package animal_inheritance_demo;
//Animal will be the Parent Class (Super Class; Base Class)
public class Animal {
    //fields below will be inherited by any child class created 
    String name;
    int noOfLegs;
    String colour;
    boolean claws;
    //methods below will be inherited by any child class created
    public void eat(){
        System.out.println(name + " is eating ");}
    public void sleep(){
        System.out.println(name + " is sleeping ");}
    public void makeSound(){
        System.out.println("Animals can make a sound");
    }
            
}

//class ChildClassName extends ParentClassName {}
//Derived Class: Dog
class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dogs bark. ");
    }
}
//Derived Class: Cat 
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cats meows. ");
    }

}


