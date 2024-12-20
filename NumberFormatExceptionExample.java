package OopAssignment;

/*
 * This program simulates a NumberFormatException.
 * NumberFormatException occurs when you try to convert a string into a number 
  (like an integer or a double), but the string does not have a valid numeric format.
 */
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "invalidNumber";// This string cannot be converted to an integer

        try {
            int number = Integer.parseInt(str);//This will trigger a NumberFormatException because "invalidNumber" is not numeric
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            //This block handles the exception and prevents the program from crashing
            System.out.println("Error: Invalid number format.");
            System.out.println("Exception Message: " + e.getMessage());
        }
         // Program execution continues here after exception handling
         System.out.println("Program execution continues smoothly after handling the exception.");
    }
}
