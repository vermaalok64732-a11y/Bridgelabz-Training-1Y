package stringApi.ProblemStatement;

import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input as String
        System.out.print("Enter number of terms: ");
        String input = scanner.nextLine();

        int terms = Integer.parseInt(input);

        // Call function to generate Fibonacci sequence
        generateFibonacci(terms);

        scanner.close();
    }

    // Function to calculate and print Fibonacci sequence
    public static void generateFibonacci(int n) {

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
