/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo_application_interface;

/**
 *
 * @author fshai
 */
public class Elephant implements Animal {
//Elephant is a child class & will implement the interface Animal Class 
    @Override
    public void speak() {
        System.out.println("Elephant: Trumpet!");
    }

    @Override
    public void eat() {
        System.out.println("Elephant: Eating leaves & grass.");
    }
    
}
