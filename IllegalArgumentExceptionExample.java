package OopAssignment;

/*
 * This program simulates an IllegalArgumentException.
 * An IllegalArgumentException is thrown when a method receives an argument that is not allowed or invalid.
 */
public class IllegalArgumentExceptionExample {

    public static void setWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight cannot be negative.");
        }
        System.out.println(" you weight " + weight + " kg ");
    }

    public static void main(String[] args) {
        try {
            setWeight(-30); //Here, negative numbers are invalid for "weight" because the method setWeight(int weight) explicitly does not allow negative values for the weights they must be greater than 0.

        } catch (IllegalArgumentException e) {
            //handling the IllegalArgumentException
            System.out.println("Error: Invalid argument provided.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    
}
