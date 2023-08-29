/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

// Java program to remove elements
// in an ArrayList

import java.util.*;

public class ArrayList_RemoveElements {

	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<>();

		al.add("fruits");
        al.add("sweets");
        al.add(1, "drinks");
  
        System.out.println(
            "Initial ArrayList " + al);
  
        al.remove(1);
  
        System.out.println(
            "After the Index Removal at [1] " + al);
  
        al.remove("sweets");
  
        System.out.println(
            "After the Object Removal " + al);
	}
}
