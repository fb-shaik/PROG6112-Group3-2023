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
import java.util.ArrayList;
public class ArrayList_Objects 
{
	public static void main(String args[])
	{
	// allowed
		int[] array = new int[3];

		// allowed, however, need to be initialized
		Test[] array1 = new Test[3];

		// not allowed (Uncommenting below line causes compiler error)
		// ArrayList<char> arrL = new ArrayList<char>();

		// Allowed
		ArrayList<Integer> arrL1 = new ArrayList<>();
		ArrayList<String> arrL2 = new ArrayList<>();
		ArrayList<Object> arrL3 = new ArrayList<>();
	}

    private static class Test {

        public Test() {
        }
    }
}
