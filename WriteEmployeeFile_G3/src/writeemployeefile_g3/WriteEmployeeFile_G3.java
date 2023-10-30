
package writeemployeefile_g3;

import java.nio.file.*; //handles input/output
import java.io.*; //handles input/output (legacy package)
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class WriteEmployeeFile_G3 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     Path file = Paths.get("C:\\Users\\fshai\\Desktop\\Chapter 13\\Employees.txt"); 
//Employees.txt is the output file we want the application to create & send data captured to //File path will be different for everyone. Used your device locations
    String s = "";
    String delimiter = " , ";
    int id;
    String name;
    double payRate;
    final int QUIT = 999;
    
    try{
    OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE)); //this generate the txt file
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output)); //BufferedWriter object 
        System.out.println("Enter employee ID Number: ");
        id = input.nextInt();
        
        while(id !=QUIT){
            System.out.println("Enter name for employee #  " + id + " : ");
            input.nextLine();
            name = input.nextLine();
            System.out.println("Enter pay rate: ");
            payRate = input.nextDouble();
            s = id + delimiter + name + delimiter + payRate; //Creates a record that has 3 fields seperated by a comma
            writer.write(s, 0 , s.length());
            writer.newLine();
            System.out.println("Enter next ID number or " + QUIT + " to quit: ");
            id = input.nextInt();
        }
        writer.close();
    }
    catch(Exception e){
        System.out.println("Message " + e);
    }
    
    }
    
}
