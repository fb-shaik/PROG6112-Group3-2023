
package throwusedcarexception;
import javax.swing.*;

public class UsedCar {
    String vin; // Vehicle Identification Number
    String make; //Make of car
    int year; // Year of manufacture
    int mileage; // Mileage of the car
    int price; // Price of the car
    
    final int VIN_NUMBER_LENGTH = 4; //lenght of a valid VIN 
    final int LOW_YEAR = 1997;//lowest acceptable year
    final int HIGH_YEAR = 2017; //highest acceptable year
    final String[] MAKES = {"Ford", "Honda", "Toyota","Chrysler", "Other"}; //array of car makes

    public UsedCar(String num, String carMake, int carYear, int miles, int pr) throws UsedCarException
 
     {boolean isBad = false;
      boolean isGoodMake = false;
      int x;

      // Check if the VIN length is not equal to VIN_NUM_LENGTH
      if(num.length() != VIN_NUMBER_LENGTH)
         isBad = true;

      // Check if all characters in the VIN are digits
      for(x = 0; x < num.length(); ++x)
         if(!Character.isDigit(num.charAt(x)))
            isBad = true;

      // Check if the car make is in the list of valid makes
      for(x = 0; x < MAKES.length; ++x)
         if(carMake.equals(MAKES[x]))
            isGoodMake = true;

      // Check if the car year is outside the acceptable range, or if mileage or price is negative
      if(carYear < LOW_YEAR || carYear > HIGH_YEAR || miles < 0 || pr < 0)
            isBad = true;

      // If any of the checks failed, throw a UsedCarException with an error message
      if(isBad)
         throw(new UsedCarException("Error in used car #" + num));

      // If all checks passed, initialize the car's attributes
      vin = num;
      make = carMake;
      year = carYear;
      mileage = miles;
      price = pr;
   }
    
}
