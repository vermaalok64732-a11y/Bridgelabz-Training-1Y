package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {

        String input = getInput();

        String reversed = reverseString(input);

        displayResult(reversed);
    }

    // Function to get input from user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        return text;
    }

    // Function to reverse the string manually
    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    // Function to display the result
    public static void displayResult(String reversed) {
        System.out.println("Reversed string: " + reversed);
    }
}
