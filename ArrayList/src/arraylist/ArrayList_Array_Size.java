/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

// A Java program to demonstrate differences between array
// and ArrayList regarding size
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Array_Size 
{
	public static void main(String args[])
	{
		/* ........... Normal Array............. */
		// Need to specify the size for array
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		// We cannot add more elements to array arr[]

		/*............ArrayList..............*/
		// Need not to specify size
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		// We can add more elements to arrL

		System.out.println(arrL);
		System.out.println(Arrays.toString(arr));
	}
}
