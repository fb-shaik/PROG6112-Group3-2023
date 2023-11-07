
package fruit_inheritance_g1;

//SubClass: Banana is an extension of the Fruit class through the concept of inheritance
//Keyword used to implement inheritance : SubClass extends SuperClass
public class Banana  extends Fruit {
    
    public Banana(String name, String colour) {
        super(name, colour);
    }
    
    //Override means that the child class method has a different behaviour than that of the Parent class &
    //the child class method will be implemented over the Parent's version for this method
    @Override
    public void taste(){
        System.out.println("This banana is soft & creamy.");
    }
    
}
