package com.gla.methods.level2;

public class UnitConvertor2 {

    // --- Temperature Conversions ---
    // a. Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // b. Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // --- Weight Conversions ---
    // c. Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        // Based on: 1 pound = 0.453592 kg
        return pounds * 0.453592;
    }

    // d. Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        // Based on: 1 kg = 2.20462 pounds
        return kilograms * 2.20462;
    }

    // --- Volume Conversions ---
    // e. Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        // Based on: 1 gallon = 3.78541 liters
        return gallons * 3.78541;
    }

    // f. Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        // Based on: 1 liter = 0.264172 gallons
        return liters * 0.264172;
    }

    // --- Main method to run examples ---
    public static void main(String[] args) {
        System.out.println("--- Unit Converter Demo ---");

        // Test a. F to C
        double f = 98.6;
        System.out.printf("%.1f F is %.2f C%n", f, convertFahrenheitToCelsius(f));

        // Test b. C to F
        double c = 37.0;
        System.out.printf("%.1f C is %.2f F%n", c, convertCelsiusToFahrenheit(c));

        // Test c. lbs to kg
        double lbs = 150;
        System.out.printf("%.1f lbs is %.2f kg%n", lbs, convertPoundsToKilograms(lbs));

        // Test d. kg to lbs
        double kg = 70;
        System.out.printf("%.1f kg is %.2f lbs%n", kg, convertKilogramsToPounds(kg));

        // Test e. gal to L
        double gal = 10;
        System.out.printf("%.1f gallons is %.2f liters%n", gal, convertGallonsToLiters(gal));

        // Test f. L to gal
        double lit = 20;
        System.out.printf("%.1f liters is %.2f gallons%n", lit, convertLitersToGallons(lit));
    }
}
