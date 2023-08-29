/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

// Java program to demonstrate the working of ArrayList in Java

import java.util.*; //Step1 import java.util.ArrayList;

class ArrayListExample {
	public static void main(String[] args)
	{
               //ArrayList<Type> arrayname = new ArrayList<>();
            
            //Create Int type ArrayList
            //ArrayList<Integer> arrayList = new ArrayList<>();
            
            //Create String type ArrayList
            //ArrayList<String> arrayList = new ArrayList<>();
            
            //create ArrayList
            ArrayList<String> languages = new ArrayList<> ();
            
            //Add in elements to ArrayList
            languages.add("Java"); //subscript[0]
            languages.add("C++"); //subscript[1]
            languages.add("Swift"); //subscript[2]
            
            //at [1]; choosing subscript position to add an element
            languages.add(1,"JavaScript");
            
            //at [0];
            languages.add(0, "Ruby");
            
            System.out.println("Intial List: " + languages);
            
            //Removing elements based on a specific subscript
            languages.remove(2);
            System.out.println("Updated List: " + languages);
            
            //Removing object directly
            languages.remove("Ruby");
            System.out.println("Updated List - Obj removed: " + languages);
            
            languages.add("Cobalt");
            System.out.println("Final update list: " + languages);
            
            
	}
}
