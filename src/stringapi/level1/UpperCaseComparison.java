package stringApi.Level1;

import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert string to uppercase using charAt() and ASCII logic
    public static String toUpperCaseUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }

            result = result + ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the text: ");
        String inputText = sc.nextLine();

        // Convert using user-defined method
        String userUpperCase = toUpperCaseUsingCharAt(inputText);

        // Convert using built-in method
        String builtInUpperCase = inputText.toUpperCase();

        // Compare both results
        boolean result = compareStrings(userUpperCase, builtInUpperCase);

        // Display results
        System.out.println("Uppercase using charAt(): " + userUpperCase);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpperCase);
        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
