/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumexample;

// Enum to represent different types of days
enum DayType {
    WEEKEND, WEEKDAY
}

// Class to encapsulate day-related information and behavior
class Day {
    private String name;
    private DayType type;

    // Constructor to initialize the day's name and type
    public Day(String name, DayType type) {
        this.name = name;
        this.type = type;
    }

    // Getter method to retrieve the day's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the day's type
    public DayType getType() {
        return type;
    }

    boolean isWorkDay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

