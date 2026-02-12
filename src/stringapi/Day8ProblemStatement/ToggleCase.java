package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {

        String input = getInput();

        String toggled = toggleCase(input);

        displayResult(toggled);
    }

    // Function to get input from user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // Function to toggle case of each character
    public static String toggleCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch; // non-alphabetic characters remain unchanged
            }
        }

        return result;
    }

    // Function to display the result
    public static void displayResult(String result) {
        System.out.println("Toggled case string: " + result);
    }
}
