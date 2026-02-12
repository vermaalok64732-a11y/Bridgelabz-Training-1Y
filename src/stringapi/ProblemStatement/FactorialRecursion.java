package stringApi.ProblemStatement;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {

        int number = getInput();

        long result = calculateFactorial(number);

        displayResult(number, result);
    }

    // Function to take input
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }

    // Function to display result
    public static void displayResult(int number, long result) {

        if (result != -1) {
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }
}
