
package property_app;

import java.text.DecimalFormat;

public class Property_App {
    
    private static final int[][] propertyPrices={{800000,1500000,200000},
                                                                                        {700000,1200000,1600000},
                                                                                        {750000,1300000,1800000}};
    private static final int totalPrices[] = new int[3];
    private static final String [] provinces = {"Gauteng", "Natal", "Cape"};
   
    public static void main(String[] args) {
       printHeadings();
       printAveragePropertyPrices();
       printTotalAveragePropertyPrices();
    }
    private static  void printHeadings(){
        System.out.println("AVERAGE PROPERTY PRICES");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("\t\tFLAT" + "\t\t\tTOWN HOUSE" +"\t\t " + "HOUSE");
        System.out.println("---------------------------------------------------------------------------------------------");
    }
    private static void printAveragePropertyPrices(){
                    for(int x = 0; x <propertyPrices.length; x++){
                        System.out.print(provinces[x] + "\t");
                        for(int y = 0; y <propertyPrices.length; y++)
                        {       
                                totalPrices[x] += propertyPrices[x][y];
                                System.out.print("\t R " + propertyPrices[x][y] + "\t");
                        }
                        System.out.println();
                    }
                       System.out.println(); 
    }
    private static void printTotalAveragePropertyPrices(){
        String pattern = "###,###.##";
        DecimalFormat df = new DecimalFormat(pattern);
        for(int i = 0; i < 3; i++){
            System.out.println("Average property prices in " + provinces[i] + " R " + df.format((totalPrices[i]/3)));
        }
    }
}
