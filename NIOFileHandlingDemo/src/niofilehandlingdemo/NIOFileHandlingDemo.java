/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niofilehandlingdemo;

/**
 *
 * @author fshaik
 */
import java.io.IOException;
import java.nio.file.*;

public class NIOFileHandlingDemo {

    public static void main(String[] args) {
        try {
            // Define a file path
            Path filePath = Paths.get("my_file.txt");

            // Example 1: Creating a File
            createFile(filePath);

            // Example 2: Writing to a File
            writeToFile(filePath, "Hello, World!");

            // Example 3: Reading from a File
            String content = readFromFile(filePath);
            System.out.println("Content from the file: " + content);

            // Example 4: Deleting a File
            deleteFile(filePath);
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        }
    }

    static void createFile(Path filePath) throws IOException {
        Files.createFile(filePath);
        System.out.println("File created: " + filePath);
    }

    static void writeToFile(Path filePath, String content) throws IOException {
        Files.write(filePath, content.getBytes());
        System.out.println("Content written to the file.");
    }

    static String readFromFile(Path filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(filePath);
        return new String(bytes);
    }

    static void deleteFile(Path filePath) throws IOException {
        Files.delete(filePath);
        System.out.println("File deleted: " + filePath);
    }
}
