
package twodarray.demo.g3;
import javax.swing.*;
//Simple 2D Arrau application to determine the rental amount based on user preference of which floor & apartment style
public class TwoDArrayDemoG3 {

    public static void main(String[] args) {
        
        /*
                1D array syntax: datatype arrayName[size] = {elements};
                2D array syntax: datatype arrayName[Rows][Columns] = {{elements},{elements},{elements}};
        */
        
        //declare a 2D array to hold the rental amounts; 4 Rows & 3 columns
        int [][] rental = {     {450, 500,550}, //R1 
                                             {700, 750, 850}, //R2
                                             {900,975,1000},  //R3
                                             {1250, 1350, 1400}, //R4
                                        };
        
        String userEntry; //used to hold user prompt
        int floors; //holds the user value for which floor they wish to rent on
        int bedrooms; //holds the user value for the apartment style they wish to rent
        
        //Prompt the user which floor they would like
        userEntry = JOptionPane.showInputDialog(" Enter which floor you would like to rent on (1-4): ");
        floors = Integer.parseInt(userEntry);
        //Prompt the user for which apartment style they would like
        userEntry = JOptionPane.showInputDialog(" How mant bedrooms should the apartment have (1-3)? ");
        bedrooms = Integer.parseInt(userEntry);
        
        //Display back to the user their prospective rental amount by calling the respective [row][column] combination
        JOptionPane.showMessageDialog(null, "The rental amount for a " + bedrooms + " apartment on the " +
                                                                                   floors + " floor is R "  + rental[floors-1][bedrooms-1]);
        
        
                
                                       
        
    }
    
}
