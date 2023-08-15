/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaggedarrayexample;

public class JaggedArrayExample {
       public static void main(String[] args) {
       /*
            2D array we have a set number of rows & columns: datatype arrayName [R][C] 
        Jagged/Ragged Array: we can set the row & adjust the coulmn lenght so we now create an uneven matrix/table
        */
    
       //Create a jagged array
       int [][] studentCourse = new int[3][]; //Defined the number of rows; will populate the the row elements to define the column lenght
       
       studentCourse[0] = new int[]{30, 12, 45}; //First course has 3 students enrolled; represents R1 of the array (lenght of the array at this point)
       studentCourse[1] = new int[]{1, 23, 56,78,8};//Second course has  5 students enrolled; represents R2 of the array (lenght of the array at this point)
       studentCourse[2] = new int[]{6,9};//Third course has 2 students enrolled; represents R2 of the array (lenght of the array at this point)
    
       //Access & print the jagged array to display 
       //For Course [] there are [] of students registered
       for(int i = 0; i <studentCourse.length; i++)//OuterLoop
       {
            System.out.println(" Course " + (i+1) + " has " + studentCourse[i].length + " students");
                        for(int j=0; j <studentCourse[i].length; j++)//Inner Loop
                        {
                            System.out.println(studentCourse[i][j] + " ");
                        }
                        System.out.println(); 
       }
       
       /*
       Outer Loop
                    iterates through the studentCourse array from index i, which represents the Row in the 2D array. This will hold the course number
       Inner Loop
                        finds the number of students for each course; this will differ in lenght for each row 
       
       */
       
    }
    
}