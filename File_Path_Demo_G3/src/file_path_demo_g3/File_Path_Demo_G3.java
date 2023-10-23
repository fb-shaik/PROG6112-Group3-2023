
package file_path_demo_g3;

//This imports all classes & interfaces from the java.nio package
//You will need this import as it allows you to use classes & methods related to file operations w/o 
//specifying the full package name each time
import java.nio.file.*;

public class File_Path_Demo_G3 {

    public static void main(String[] args) {
       
        //Obtain the default FileSystem for the current enviroment
        FileSystem fs = FileSystems.getDefault();
        //FileSystem: Used to create the object
        //fs: object name
        //FileSystems: contain the factory methods used in the object creation 
        
        Path path = fs.getPath("C:\\Users\\fshai\\Desktop\\Chapter 13\\Data.txt");
        //Path: Built in Path class
         //path: object
         //Path will be different for everyone. Its based on the location of where you have stored the file
         // In Java a single back-slash is an escape sequnce(\); For a file path, you will need a double \\ 
        System.out.println(fs);
    }
    
}
