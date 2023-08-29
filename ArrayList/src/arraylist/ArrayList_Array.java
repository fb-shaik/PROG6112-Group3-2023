/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

// A Java program to demonstrate differences between array
// and ArrayList
import java.util.ArrayList;
import java.util.Arrays;

class ArrayList_Array
{
	public static void main(String args[])
	{
		/* ........... Normal Array............. */
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		System.out.println(arr[0]);

		/*............ArrayList..............*/
		// Create an arrayList with initial capacity 2
		ArrayList<Integer> arrL = new ArrayList<Integer>(2);

		// Add elements to ArrayList
		arrL.add(1);
		arrL.add(2);

		// Access elements of ArrayList
		System.out.println(arrL.get(0));
	}
}
