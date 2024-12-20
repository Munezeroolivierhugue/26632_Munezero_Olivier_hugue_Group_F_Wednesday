package OopAssignment;

/*
 * This program simulates an ArrayIndexOutOfBoundsException.
 * It accesses an invalid index in an array.
 */
public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {8,5,7,9,10};

        try {
            System.out.println(numbers[9]); // Accessing an invalid index
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling invalid array index access
            System.out.println("Error: Invalid array index accessed.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
