package OopAssignment;

/*
 * This program simulates a ClassCastException.
 * It attempts to convert/cast an object from one type to another incompatible type.
 */
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = "Iris";
        try {
            // attempting to convert a string to Integer an integer which is an invalid cast
            Integer num = (Integer) obj;
            System.out.println(num);
        } catch (ClassCastException e) {
            // Handling invalid type casting
            System.out.println("Error: Invalid type casting.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}

