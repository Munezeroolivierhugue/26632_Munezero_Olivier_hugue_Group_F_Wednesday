package OopAssignment;

/*
 * This program simulates a NullPointerException.
 * It attempts to access a method on a null reference.
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;

        try {
            // Attempt to return the lenght of  on a null reference
            System.out.println(" the Length of "+str+" string is "+str.length());
        } catch (NullPointerException e) {
             // Handle null reference access
            System.out.println("Error: Null reference encountered.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
