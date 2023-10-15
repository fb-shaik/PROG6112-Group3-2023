
package speedingfineapplication_g3;
/**
 * This will be the parent class & will be abstract
 * It will contain fields & methods in which the child class 
 * will inherit
 */
public abstract class Fine implements iFine {
    //fields for the Parent class; every child class will have access to via inheritance
    private String citizenName;
    protected int speed;
    private double finePayable;
    
    //parameterized constructor that requires citizenName & speed as requested fields 
    //when building child class objects 
    public Fine(String citizenName, int speed){
    this.citizenName = citizenName;
    this.speed = speed;
    
}
    public String getCitizenName() {
        return citizenName;
    }
    public int getSpeed() {
        return speed;
    }
    public double getFinePayable() {
        return finePayable;
    }
    
    //abstract method to calculate the fine
    public abstract double calculateFine();
    
    
}