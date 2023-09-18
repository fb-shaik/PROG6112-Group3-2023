//abstract class>>>no objects can be built directly from this class

package abstract_class_demo_g3;
//SuperClass/Parent class 

public abstract class Animal {
    private String name; 

    //abstract method; has no method body & no {}
    //the concrete child/subclass will provide it's own implementation / method body when
    //the method is invoked via the child/subclass object.
    public abstract void sound();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
