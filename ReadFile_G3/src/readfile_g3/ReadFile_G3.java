package readfile_g3;
import java.nio.file.*;
import java.io.*;

public class ReadFile_G3 {
    public static void main(String[] args) {
        //Define a Path object representing the file path
        Path file = Paths.get("C:\\Users\\fshai\\Desktop\\Chapter 13\\Data.txt");
        
        //Initialize an InputStream variable called 'input' as null
        InputStream input = null;
        
        try{
        //Open an input stream for the above specified file path
        input = Files.newInputStream(file);
        //Create a BufferedReader to read data from the input stream
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        
        //intialize a variable to store the read line
        String s = null;
        
        //Read a line from the file & store in the above variable
        s = reader.readLine();
        //Print the above to console
            System.out.println(s);
            //Close the input stream
            input.close();
        
        }
        catch(IOException e){
            System.out.println(e);
        }

        }
    }


