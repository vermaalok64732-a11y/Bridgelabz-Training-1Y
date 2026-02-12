package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static void main(String[] args) {

        String input = getInput("Enter a string: ");
        char chToRemove = getCharInput("Enter the character to remove: ");

        String result = removeCharacter(input, chToRemove);

        displayResult(result);
    }

    // Function to get string input from user
    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    // Function to get a single character input from user
    public static char getCharInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();
        return input.charAt(0);
    }

    // Function to remove all occurrences of a specific character
    public static String removeCharacter(String text, char ch) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch) {
                result += text.charAt(i);
            }
        }
        return result;
    }

    // Function to display result
    public static void displayResult(String result) {
        System.out.println("Modified String: " + result);
    }
}
