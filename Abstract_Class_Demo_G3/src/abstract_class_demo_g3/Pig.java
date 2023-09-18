package abstract_class_demo_g3;

public class Pig extends Animal {
    //Subclass (Child Class) will be concrete 
    //can build objects from this class
    //It will be an extension / inherited class of the abstract Animal Class
    @Override
    public void sound(){
        System.out.println("Oink!!!");
    }
}
