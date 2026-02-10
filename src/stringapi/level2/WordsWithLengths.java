package stringApi.Level2;

import java.util.Scanner;

public class WordsWithLengths {

    // Method to find the length of a string without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached end of string
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {
        int length = getLength(text);
        int wordCount = 1;

        // Count spaces to get the number of words
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

    // Method to create 2D array with word and its length
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(getLength(words[i]));
        }

        return wordLengths;
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

        // Display result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordLengths.length; i++) {
            String word = wordLengths[i][0];
            int length = Integer.parseInt(wordLengths[i][1]); // convert string to int
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}
