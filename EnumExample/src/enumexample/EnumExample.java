/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumexample;
// Main class to demonstrate the usage of the Day class
public class EnumExample {
    public static void main(String[] args) {
        // Create Day objects for specific days
        Day monday = new Day("Monday", DayType.WEEKDAY);
        Day saturday = new Day("Saturday", DayType.WEEKEND);

        // Print day information
        System.out.println(monday.getName() + " is a " + monday.getType());
        System.out.println(saturday.getName() + " is a " + saturday.getType());

        // Check if it's a work day or weekend day
        if (monday.isWorkDay()) {
            System.out.println(monday.getName() + " is a work day.");
        } else {
            System.out.println(monday.getName() + " is a weekend day.");
        }

        // Create an array of Day objects for days of the week
        Day[] daysOfWeek = {
            new Day("Sunday", DayType.WEEKEND),
            new Day("Monday", DayType.WEEKDAY),
            // ... Add other days here ...
        };

        // Print day information for days of the week
        System.out.println("\nDays of the week:");
        for (Day day : daysOfWeek) {
            System.out.println(day.getName() + " is a " + day.getType());
        }
    }
}


