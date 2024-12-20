package OopAssignment;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * This program simulates an IOException.
 * It attempts to read a file that does not exist,
 * triggering an IOException which is then handled using a try-catch block.
 */
public class IOExceptionExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ganza\\OneDrive\\Desktop\\javcodes\\Source\\OopAssignment\\oop.java"); // File that does not exist
        FileReader reader = null;

        try {
            // Attempting to open a file for reading
            reader = new FileReader(file);
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            // Handling the exception when file is not found or cannot be read
            System.out.println("Error: File not found or unable to read.");
        } finally {
            // Close the FileReader if it was opened
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("FileReader closed successfully.");
                } catch (IOException e) {
                    System.out.println("Error while closing FileReader.");
                }
            }
        }
    }
}

