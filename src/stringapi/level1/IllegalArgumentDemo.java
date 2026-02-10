package stringApi.Level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // start index is greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException and RuntimeException
    public static void handleException(String text) {
        try {
            // start index is greater than end index
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Calling method to generate the exception
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // Calling method to handle the exception
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(input);

        sc.close();
    }
}
