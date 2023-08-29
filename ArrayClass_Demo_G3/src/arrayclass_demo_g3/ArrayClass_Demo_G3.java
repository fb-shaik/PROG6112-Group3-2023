package arrayclass_demo_g3;

//import statement is needed to make use of the Arrays Class
import java.util.Arrays;
public class ArrayClass_Demo_G3 {

    public static void main(String[] args) {
        //create an array of numbers
        int [] numbers = {5,2,1,8,4,10}; //size of array is 6
        //printout the original values in the array
        System.out.println("Original Array Values: " + Arrays.toString(numbers));
       
        //Sort the array values
        Arrays.sort(numbers);
        System.out.println("Sorted Array Values: " + Arrays.toString(numbers));
        
        //Searching for an element within the array
        int searchElement = numbers[3];
        int index = Arrays.binarySearch(numbers, searchElement);
        if(index >= 0){
                    System.out.println(searchElement + " found at index " + index);
        } else{
                    System.out.println(searchElement + " not found in the array ");
        }
        
        //Filling the array with a set value
        int [] filledArray = new int [5]; //array has a size of 5
        Arrays.fill(filledArray, 10);
        System.out.println("The filled Array has : " + Arrays.toString(filledArray));
        
        //Copying Arrays 
        int [] sourceArray = {1,2,3,4,5}; //array to be copied
        int [] destinationArray = new int[5]; //will hold the same elements as the above array
        System.arraycopy(sourceArray, 0, destinationArray,0,sourceArray.length);
        System.out.println("Copied Array: " + Arrays.toString(destinationArray));
       
    }
    
}
