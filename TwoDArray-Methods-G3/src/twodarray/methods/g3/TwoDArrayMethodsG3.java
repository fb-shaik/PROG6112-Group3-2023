
package twodarray.methods.g3;
//Simple app to illustrate the use of 2D arrays & methods
public class TwoDArrayMethodsG3 {
    
    public static void main(String[] args) {
        //declare a 2D array
        int arr_2d[][] = {{1,2,3}, //R1
                                {4,5,6}, //R2
                                {7,8,9}}; //R3
       //array size [R][C]: 3 Rows & 3 Columns >>>>> size is 9 (3x3)
       
   //method call to pass the 2D Array 
    passArray(arr_2d);
       
    }
    //create a method that will receive the above 2D array as a parameter
    public static void passArray(int [][]arr_2d)//need to have [R][C] in the parameter list to show a 2d array is passed
    {
            //print values in the 2dArray require a nested loop to acces both the Rows & Columns of the 2D Array
            for (int i=0 ; i <arr_2d.length; i++) //outer loop will deal with the Rows
            {
                for(int j = 0; j <arr_2d.length; j++)//inner loop will deal with the Columns
                    {System.out.println(arr_2d[i][j] + " ");}
            }
                System.out.println();
    }
}
