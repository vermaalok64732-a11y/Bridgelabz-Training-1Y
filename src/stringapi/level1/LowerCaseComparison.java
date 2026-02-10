package stringApi.Level1;

import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert string to lowercase using charAt() and ASCII logic
    public static String toLowerCaseUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
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
        String userLowerCase = toLowerCaseUsingCharAt(inputText);

        // Convert using built-in method
        String builtInLowerCase = inputText.toLowerCase();

        // Compare both results
        boolean result = compareStrings(userLowerCase, builtInLowerCase);

        // Display results
        System.out.println("Lowercase using charAt(): " + userLowerCase);
        System.out.println("Lowercase using toLowerCase(): " + builtInLowerCase);
        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
