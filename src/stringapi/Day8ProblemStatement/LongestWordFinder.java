package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class LongestWordFinder {

    public static void main(String[] args) {

        String sentence = getInput();

        String longestWord = findLongestWord(sentence);

        displayResult(longestWord);
    }

    // Function to get input from user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        return text;
    }

    // Function to find the longest word
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // split by spaces
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    // Function to display result
    public static void displayResult(String word) {
        System.out.println("The longest word is: " + word);
    }
}
