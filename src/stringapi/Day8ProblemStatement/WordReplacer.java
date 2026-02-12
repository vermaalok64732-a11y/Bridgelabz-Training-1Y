package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class WordReplacer {

    public static void main(String[] args) {

        String sentence = getInput("Enter a sentence: ");
        String targetWord = getInput("Enter the word to replace: ");
        String replacementWord = getInput("Enter the replacement word: ");

        String modifiedSentence = replaceWord(sentence, targetWord, replacementWord);

        displayResult(modifiedSentence);
    }

    // Function to get input from user
    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    // Function to replace a word manually
    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" "); // split sentence into words
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                result += replacement;
            } else {
                result += words[i];
            }
            if (i < words.length - 1) {
                result += " "; // add space between words
            }
        }

        return result;
    }

    // Function to display the result
    public static void displayResult(String sentence) {
        System.out.println("Modified sentence: " + sentence);
    }
}
