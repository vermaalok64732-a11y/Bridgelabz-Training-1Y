package stringApi.ProblemStatement;

import java.util.Scanner;

public class MaximumOfThree {

    public static void main(String[] args) {

        // Take input
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");
        int num3 = getInput("Enter third number: ");

        // Calculate maximum
        int max = findMaximum(num1, num2, num3);

        // Display result
        displayResult(max);
    }

    // Function to take input as String and convert to integer
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    // Function to calculate maximum of three numbers
    public static int findMaximum(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    // Function to display result
    public static void displayResult(int max) {
        System.out.println("The maximum number is: " + max);
    }
}
