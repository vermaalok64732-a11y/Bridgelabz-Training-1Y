package com.gla.methods.level2;

public class UnitConvertor1 {

    // Conversion factors based on user requirements

    // Yards to Feet: 1 yard = 3 feet
    private static final double YARDS_TO_FEET_FACTOR = 3.0;

    // Feet to Yards: 1 foot ≈ 0.333333 yards
    private static final double FEET_TO_YARDS_FACTOR = 0.333333;

    // Meters to Inches: 1 meter ≈ 39.3701 inches
    private static final double METERS_TO_INCHES_FACTOR = 39.3701;

    // Inches to Meters: 1 inch = 0.0254 meters
    private static final double INCHES_TO_METERS_FACTOR = 0.0254;

    // Inches to Centimeters: 1 inch = 2.54 cm
    private static final double INCHES_TO_CM_FACTOR = 2.54;



    public static double convertYardsToFeet(double yards) {
        // double yards2feet = 3; (The user specified this code as a factor, not a direct calculation)
        return yards * YARDS_TO_FEET_FACTOR;
    }


    public static double convertFeetToYards(double feet) {
        // double feet2yards = 0.333333; (Factor)
        return feet * FEET_TO_YARDS_FACTOR;
    }


    public static double convertMetersToInches(double meters) {
        // double meters2inches = 39.3701; (Factor)
        return meters * METERS_TO_INCHES_FACTOR;
    }


    public static double convertInchesToMeters(double inches) {
        // double inches2meters = 0.0254; (Factor)
        return inches * INCHES_TO_METERS_FACTOR;
    }


    public static double convertInchesToCentimeters(double inches) {
        // double inches2cm = 2.54; (Factor)
        return inches * INCHES_TO_CM_FACTOR;
    }

    // Example Usage (main method can be added for testing)
    public static void main(String[] args) {
        System.out.println("10 yards to feet: " + convertYardsToFeet(10)); // Expected: 30.0
        System.out.println("9 feet to yards: " + convertFeetToYards(9));   // Expected: ~3.0
        System.out.println("2 meters to inches: " + convertMetersToInches(2)); // Expected: ~78.7402
        System.out.println("50 inches to meters: " + convertInchesToMeters(50)); // Expected: 1.27
        System.out.println("10 inches to centimeters: " + convertInchesToCentimeters(10)); // Expected: 25.4
    }
}
