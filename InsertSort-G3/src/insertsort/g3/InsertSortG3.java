
package insertsort.g3;
//Simple app to show how Insert Sort Works

//Console app
import java.util.*;
public class InsertSortG3 {

    public static void main(String[] args) {
        //create an array to hold some values, populate the array as well
        int[] numArray = {34,8,12,90,5,1}; //array size of 6; subscript [0] to [5]
        System.out.println(" Original Array Values Unsorted : " + Arrays.toString(numArray));
        
        //apply the insert sort to the above array & create an organized array from lowest to highest value
        for (int k = 1; k < numArray.length; k++)
        {
                //introduce a temp variable to hold the moving index
            int temp = numArray[k]; //this holds the value at [1]
            int j = k-1; //this holds the index to the left of the value in question
            while (j>=0 && temp <=numArray[j]) //both conditions need to be true
            {
                    numArray[j+1] = numArray[j];
                    j=j-1;
            }
            numArray[j+1] = temp;
        }
        System.out.println(" Sorted Values in the Array after the Insert Algorithm: " + Arrays.toString(numArray));
    }
    
}
