package stringApi.ProblemStatement;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int low = 1;
    static int high = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (true) {

            int guess = generateGuess();
            System.out.println("Is your number: " + guess + " ?");

            String feedback = getUserFeedback(scanner);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed your number correctly!");
                break;
            }

            updateRange(feedback, guess);
        }

        scanner.close();
    }

    // Function to generate random guess within range
    public static int generateGuess() {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    // Function to get user feedback
    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Enter 'high', 'low', or 'correct': ");
        return scanner.nextLine();
    }

    // Function to update guessing range
    public static void updateRange(String feedback, int guess) {
        if (feedback.equalsIgnoreCase("high")) {
            high = guess - 1;
        } else if (feedback.equalsIgnoreCase("low")) {
            low = guess + 1;
        }
    }
}
