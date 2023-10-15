
package speedingfineapplication_g3;

/*
This is a child class of the Fine Class (Parent/Super Class)
It will inherit any fileds & methods within the Parent Class
It will also provide implementation for any inherited abstract methods
*/
public class SpeedingFines extends Fine implements iFine {
//parameterized constructor (citizenName & Speed)
    public SpeedingFines(String citizenName, int speed) {
        super(citizenName, speed);
    }

    //Implement the calculation to determine if a fine is payable
    @Override
    public double calculateFine() {
        if(speed >=120){
            return speed * 10.20;
        }else
        {return 0.0;}
        
    }
    
    @Override
    public void PrintFine() {
        System.out.println("Citizen Name: " + getCitizenName());
        System.out.println("Speed: " + getSpeed() + " km/h");
        System.out.println("Fine Payable: R " + getFinePayable());
    }
    
}
