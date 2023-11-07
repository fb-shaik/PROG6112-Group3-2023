
package fruit_inheritance_g1;

//SuperClass: Fruit; will behave as the parent class & any classes that extend/derived from this class will
//inherit the Fruit Class's fields & methods
//Keyword for inheritance: extends

public class Fruit {
    private String name; //every fruit has a name
    private String colour; //every fruiy has a colour
    
    //parameterized constructor; this means every child class object will have to also make 
    //use of the below constructor when creating child objects
    public Fruit(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
    
    //This is the parent's version of the method
    public void taste(){
        System.out.println("This fruit is delicious."); 
    }
    
    
}
