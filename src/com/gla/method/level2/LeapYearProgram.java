package com.gla.methods.level2;

import java.util.Scanner;

public class LeapYearProgram {

    public static boolean isLeapYear(int year) {

        if (year < 1582) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Year is a Leap Year.");
        } else {
            System.out.println("Year is not a Leap Year.");
        }

        scanner.close();
    }
}
