
package file_accessibility_g3;

import java.io.File;
import java.nio.file.*; //nio: new input output; used after the Java 7 update

public class File_Accessibility_G3 {

    public static void main(String[] args) {
        //define a file path to check accessibility
        String filePath = "C:\\Users\\fshai\\Desktop\\Chapter 13\\Data.txt";
        //The above file path will be different for everyone
        //It should reflect the location on your laptop/device for the text file created earlier. 
        System.out.println("New Input Output Package: java.nio");
        checkFileAccessibilityNIO(filePath);
        System.out.println("\nLegacy Package: java.io");
         checkFileLegacy(filePath);
           
    }
    
    //Check file accessibility using java.nio.file
    public static void checkFileAccessibilityNIO(String filePath){
    Path path = Paths.get(filePath);
    //check if the file exists
    boolean exists = Files.exists(path);
    //check to see if the file is readable
    boolean isReadable = Files.isReadable(path);
    //check to see if the file is writable 
    boolean isWritable = Files.isWritable(path);
    
        System.out.println("File exists: " + exists);
        System.out.println("File is readable: " + isReadable);
        System.out.println("File is writable: " + isWritable);
    }
        //Legacy Package (java.io)
   public static void checkFileLegacy(String filePath){
   File file = new File(filePath);
   boolean exists = file.exists();
   boolean isReadable = file.canRead();
   boolean isWritable = file.canWrite();
       
        System.out.println("File exists: " + exists);
        System.out.println("File is readable: " + isReadable);
        System.out.println("File is writable: " + isWritable);
   
   
   
   
   }    
}
