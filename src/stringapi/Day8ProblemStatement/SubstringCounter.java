package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class SubstringCounter {

    public static void main(String[] args) {

        String mainString = getInput("Enter the main string: ");
        String subString = getInput("Enter the substring to count: ");

        int count = countOccurrences(mainString, subString);

        displayResult(subString, count);
    }

    // Function to get input from user
    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    // Function to count occurrences of substring
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // move past the current match
        }

        return count;
    }

    // Function to display result
    public static void displayResult(String subStr, int count) {
        System.out.println("The substring \"" + subStr + "\" occurs " + count + " times.");
    }
}
