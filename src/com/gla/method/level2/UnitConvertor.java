package com.gla.methods.level2;

public class UnitConvertor {

    // Conversion factors
    private static final double KM_TO_MILES_FACTOR = 0.621371;
    private static final double MILES_TO_KM_FACTOR = 1.60934;
    private static final double METERS_TO_FEET_FACTOR = 3.28084;
    private static final double FEET_TO_METERS_FACTOR = 0.3048;


    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES_FACTOR;
    }


    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM_FACTOR;
    }


    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET_FACTOR;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS_FACTOR;
    }


    public static void main(String[] args) {
        double kilometers = 10.0;
        double miles = 5.0;
        double meters = 50.0;
        double feet = 100.0;

        System.out.println(kilometers + " km = " + convertKmToMiles(kilometers) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}
