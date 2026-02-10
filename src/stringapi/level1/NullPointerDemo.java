package stringApi.Level1;

public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;   // text initialized to null

        // This line will generate NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;   // text initialized to null

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("String variable is null.");
        }
    }

    public static void main(String[] args) {

        // Calling method to generate the exception
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // Refactored code to handle the exception
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
