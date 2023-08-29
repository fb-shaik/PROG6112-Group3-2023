/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
//Add to specific element position
import java.util.ArrayList;

class add_elements_specific {
  public static void main(String[] args){

    // create ArrayList
    ArrayList<String> languages = new ArrayList<>();

    // Add elements to ArrayList
    languages.add("Java");
    languages.add("Python");
    languages.add("Swift");
    
    // add JavaScript at index 1
        languages.add(1, "JavaScript");

    // add C++ at index 3
            languages.add(3, "C++");
    System.out.println("ArrayList: " + languages);
  }
}