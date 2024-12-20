package OopAssignment;

/*
 * This program simulates an ArithmeticException.
 * It divides a number by zero.
 */
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int answer = 7 / 0;// dividing a number by zero
            System.out.println("Answer is " + answer);
        } catch (ArithmeticException e) {
            // // Handling division by zero error
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
