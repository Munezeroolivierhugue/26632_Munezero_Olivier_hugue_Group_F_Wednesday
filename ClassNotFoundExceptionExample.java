package OopAssignment;

/*
 * This program simulates a ClassNotFoundException.
 * It attempts to load a class that does not exist.
 */
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
             // Attempting to load a class that does not exist
            Class.forName("InvalidClassName");
            System.out.println("Class loaded successfully.");
        } catch (ClassNotFoundException e) {
            // Handling the exception when the class is not found
            System.out.println("Error: Class not found.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}

