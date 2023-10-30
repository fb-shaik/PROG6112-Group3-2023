
package screenout_g3;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;

public class ScreenOut_G3 {
    
    public static void main(String[] args) {
        //Define the file path via a Path object 
        Path file = Paths.get("C:\\Users\\fshai\\Desktop\\Chapter 13\\FileOut.docx");
        
        // Define a string "s" with the value "ABCDE"
        String s = "ABCDE";
        
        // Convert the string to a byte array
        byte[] data = s.getBytes();
        
        // Initialize an OutputStream variable named "output" as null
        OutputStream output = null;
        
        try {
     //Open  buffered output stream to the specified file with the CREATE option
     output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
     
     //Write the byte array "data" to the above output stream 
     output.write(data);
     //Flush any buffered data to ensure all has been written to the text file created above
     output.flush();
     //Close the output stream
     output.close();
     
        } catch (Exception e) {
            // If an exception is caught, print an error message along with the exception details
            System.out.println("Message: " + e);
        }
    }
}
