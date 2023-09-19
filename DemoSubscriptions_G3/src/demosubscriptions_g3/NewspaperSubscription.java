
package demosubscriptions_g3;

//this is an abstract class; you can't build objects directly from this class 
//Super/Parent Class 
public abstract class NewspaperSubscription {
    
    private String name;
    String address;
    double rate; 

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public double getRate() {
        return rate;
    }
    
    //abstract method
    public abstract void setAddress(String s);
    
}
