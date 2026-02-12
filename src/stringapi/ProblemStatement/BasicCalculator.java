package stringApi.ProblemStatement;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        String input1 = scanner.nextLine();
        double num1 = Double.parseDouble(input1);

        // Input second number
        System.out.print("Enter the second number: ");
        String input2 = scanner.nextLine();
        double num2 = Double.parseDouble(input2);

        // Choose operation
        System.out.print("Choose operation (+, -, *, /): ");
        String operator = scanner.nextLine();

        // Perform operation and display result
        switch (operator) {
            case "+":
                System.out.println("Result: " + add(num1, num2));
                break;
            case "-":
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case "*":
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }

        scanner.close();
    }

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        return a / b;
    }
}
