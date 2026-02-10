package stringApi.Level2;

import java.util.Scanner;

public class ShortestLongestWords {

    // Method to find length of a string without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {
        int length = getLength(text);
        int wordCount = 1;

        // Count spaces to get number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[index++] = word;
                start = i + 1;
            }
        }

        // Last word
        String lastWord = "";
        for (int j = start; j < length; j++) {
            lastWord += text.charAt(j);
        }
        words[index] = lastWord;

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(getLength(words[i]));
        }

        return wordLengths;
    }

    // Method to find shortest and longest word lengths
    public static String[] findShortestLongest(String[][] wordLengths) {
        if (wordLengths.length == 0) return new String[]{"", ""};

        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];
        int minLen = Integer.parseInt(wordLengths[0][1]);
        int maxLen = Integer.parseInt(wordLengths[0][1]);

        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < minLen) {
                minLen = len;
                shortest = wordLengths[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = wordLengths[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full text input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = splitUsingCharAt(text);

        // Get 2D array of words and their lengths
        String[][] wordLengths = getWordsWithLengths(words);

        // Find shortest and longest words
        String[] shortestLongest = findShortestLongest(wordLengths);

        // Display the results
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println(wordLengths[i][0] + "\t" + wordLengths[i][1]);
        }

        System.out.println("\nShortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);

        sc.close();
    }
}
