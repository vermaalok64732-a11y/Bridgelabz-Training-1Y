package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String input = getInput();

        String result = removeDuplicates(input);

        displayResult(result);
    }

    // Function to get input from user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        return text;
    }

    // Function to remove duplicate characters
    public static String removeDuplicates(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (result.indexOf(ch) == -1) { // character not already in result
                result += ch;
            }
        }
        return result;
    }

    // Function to display result
    public static void displayResult(String text) {
        System.out.println("String after removing duplicates: " + text);
    }
}
