package stringApi.ProblemStatement;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        String tempInput = scanner.nextLine();
        double temp = Double.parseDouble(tempInput);

        System.out.print("Convert to (C/F): ");
        String unit = scanner.nextLine().toUpperCase();

        if (unit.equals("C")) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println(temp + "°F = " + celsius + "°C");
        } else if (unit.equals("F")) {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println(temp + "°C = " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid unit. Please enter 'C' or 'F'.");
        }

        scanner.close();
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
