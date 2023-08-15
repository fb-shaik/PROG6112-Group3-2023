/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliveryapp.console;
public class DeliveryAppConsole {

    public static void main(String[] args) {

        // Arrays to store months and delivery years
        String[] months = {" ", "JAN", "FEB", "MAR"};
        String[] deliveryYears = {"DELIVERIES 2018     ", "DELIVERIES 2019     ", "DELIVERIES 2020     "};

        // 2D array to store the number of deliveries each month for each year
        int[][] deliveries = {
                {128, 135, 139},
                {155, 129, 175},
                {129, 130, 185},
        };

        // Arrays to store the total deliveries for each month and the maximum and minimum deliveries
        int[] totalDeliveries = {0, 0, 0};
        int maximum = 0;
        int minimum = 2000;

        // Loop through the deliveries array to find the maximum, minimum, and accumulate total deliveries
        for (int i = 0; i < deliveries.length; i++) {
            for (int j = 0; j < deliveries[i].length; j++) {
                if (deliveries[i][j] > maximum) {
                    maximum = deliveries[i][j];
                }
                if (deliveries[i][j] < minimum) {
                    minimum = deliveries[i][j];
                }
                totalDeliveries[j] += deliveries[i][j];
            }
        }

        // Print the header for the deliveries report
        System.out.println("**********************************************");
        System.out.println("DELIVERIES REPORT");
        System.out.println("**********************************************");

        // Display the months
        for (String month : months) {
            if (month.equals(" ")) {
                System.out.printf("                    ", month);
            } else {
                System.out.printf("%-8s ", month);
            }
        }

        System.out.println();

        // Display the deliveries for each year
        for (int i = 0; i < deliveries.length; i++) {
            System.out.printf("%-17s", deliveryYears[i]);
            for (int j = 0; j < deliveries[i].length; j++) {
                System.out.printf("%-9s ", deliveries[i][j]);
            }
            System.out.println();
        }

        // Print the header for the deliveries statistics
        System.out.println("**********************************************");
        System.out.println("DELIVERIES STATISTICS");
        System.out.println("**********************************************");

        // Display the total, maximum, and minimum deliveries
        System.out.println("Total deliveries: " + "  " + (totalDeliveries[0] + totalDeliveries[1] + totalDeliveries[2]));
        System.out.println("Maximum deliveries: " + maximum);
        System.out.println("Minimum deliveries: " + minimum);
        System.out.println("**********************************************");
    }
}
