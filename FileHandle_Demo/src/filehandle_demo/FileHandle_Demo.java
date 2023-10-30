/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandle_demo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandle_Demo {

    public static void main(String[] args) {
        // Define a file path
        String filePath = "example.txt";

        // Example 1: Writing to a file
        writeToFile(filePath, "Hello, World!");

        // Example 2: Reading from a file
        String content = null;
        try {
            content = readFromFile(filePath);
        } catch (IOException ex) {
            Logger.getLogger(FileHandle_Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Content from the file: " + content);

        // Example 3: Checking file existence
        boolean fileExists = doesFileExist(filePath);
        System.out.println("File exists: " + fileExists);

        // Example 4: Exception handling
        try {
            String nonExistentFilePath = "non_existent.txt";
            String nonExistentContent = readFromFile(nonExistentFilePath);
            System.out.println("Content from the non-existent file: " + nonExistentContent);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        }
    }

    // Method to write content to a file
    static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        }
    }

    // Method to read content from a file
    static String readFromFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    // Method to check if a file exists
    static boolean doesFileExist(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }
}
