package stringApi.Level2;

import java.util.Scanner;

public class SplitTextComparison {

    // Method to find length of a string without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {
        int length = getLength(text);
        int wordCount = 1; // At least one word exists

        // Count spaces to find number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;  // Start index of a word
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                // Extract word from start to i-1
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[wordIndex++] = word;
                start = i + 1; // Update start to next character
            }
        }

        // Add the last word
        String lastWord = "";
        for (int j = start; j < length; j++) {
            lastWord += text.charAt(j);
        }
        words[wordIndex] = lastWord;

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full text input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Split using user-defined method
        String[] customSplit = splitUsingCharAt(input);

        // Split using built-in method
        String[] builtInSplit = input.split(" ");

        // Compare both arrays
        boolean result = compareStringArrays(customSplit, builtInSplit);

        // Display results
        System.out.println("\nWords using user-defined method:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both split results equal? " + result);

        sc.close();
    }
}
