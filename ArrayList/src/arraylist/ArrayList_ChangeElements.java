/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author fshai
 */
// Java program to change elements in an ArrayList

import java.util.*;

public class ArrayList_ChangeElements {

	public static void main(String args[])
	{
		ArrayList<String> arraylist = new ArrayList<>();

		arraylist.add("Hello");
		arraylist.add("Hi");
		arraylist.add(1, "Geeks");

		System.out.println("Initial ArrayList " + arraylist);

		arraylist.set(1, "For");

		System.out.println("Updated ArrayList " + arraylist);
	}
}
