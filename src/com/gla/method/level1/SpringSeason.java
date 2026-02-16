package com.gla.methods.level1;

public class SpringSeason {

    // Method to check if given date is in Spring season
    public static boolean isSpringSeason(int month, int day) {

        // Spring: March 20 to June 20
        if ((month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean result = isSpringSeason(month, day);

        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
