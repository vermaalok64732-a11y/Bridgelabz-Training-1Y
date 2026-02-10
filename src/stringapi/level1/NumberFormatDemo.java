package stringApi.Level1;

import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not numeric
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException and RuntimeException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Input text is not a valid number.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input as String
        System.out.print("Enter a string value: ");
        String input = sc.next();

        // Calling method to generate the exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // Calling method to handle the exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(input);

        sc.close();
    }
}
