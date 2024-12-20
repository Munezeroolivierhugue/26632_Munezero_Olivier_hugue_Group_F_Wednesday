package OopAssignment;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * This program simulates an EOFException.
 * It attempts to read beyond the end of a file.
 */
public class EOFExceptionExample {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            // Open a file and read serialized objects
            ois = new ObjectInputStream(new FileInputStream("data.txt"));
            while (true) {
                System.out.println(ois.readObject()); // Read objects until EOF but This line will not execute because an exception will occur before it
            }
        } catch (EOFException e) {
            // Handling end of file exception
            System.out.println("End of file reached.");
        } catch (IOException | ClassNotFoundException e) {
            // Handling other IO errors or missing classes
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Ensure the stream is closed to release the resource
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Error while closing ObjectInputStream.");
                }
            }
        }
            }
    }


