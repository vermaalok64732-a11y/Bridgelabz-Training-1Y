package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        String input = getInput();

        char mostFrequent = findMostFrequentChar(input);

        displayResult(mostFrequent);
    }

    // Function to get input from user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // Function to find the most frequent character
    public static char findMostFrequentChar(String text) {
        int[] freq = new int[256]; // ASCII character frequency
        String lower = text.toLowerCase(); // ignore case

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            freq[ch]++;
        }

        int max = -1;
        char mostFrequent = ' ';

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    // Function to display result
    public static void displayResult(char ch) {
        System.out.println("Most Frequent Character: '" + ch + "'");
    }
}
