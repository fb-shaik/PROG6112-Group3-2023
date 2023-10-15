
package speedingfineapplication_g3;

public class SpeedingFineApplication_G3 {

    public static void main(String[] args) {
       //capture the citizenName & speed
       String citizenName = " Joe Blog ";
       int speed = 150;
       
       //create an instance of the SpeedingFine child class 
       SpeedingFines speedingFine = new SpeedingFines(citizenName, speed);
       
       //Call the PrintFine method to display the fine details
       speedingFine.PrintFine();
    }
    
}
