package OopAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * This program simulates a FileNotFoundException.
 * It attempts to open a file that doesn't exist.
 */
public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to open a file named anotherFile which does not exist
            FileInputStream file = new FileInputStream("anotherFile.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
             // Handling the exception when that file named anotherFile is not found
            System.out.println("Error: File not found.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
