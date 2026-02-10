package stringApi.Level3;

import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    static String[] months = { "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December" };

    // Array of days in each month (non-leap year)
    static int[] daysInMonth = { 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31 };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) { // February
            return isLeapYear(year) ? 29 : 28;
        } else {
            return daysInMonth[month - 1];
        }
    }

    // Method to get the first day of the month using Zeller's Congruence
    // Returns 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    public static int getFirstDayOfMonth(int month, int year) {
        int m = month;
        int y = year;

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;

        int day = (1 + (13 * (m + 1)) / 5 + k + k/4 + j/4 + 5*j) % 7;

        // Zeller's Congruence returns 0=Saturday, 1=Sunday, ..., 6=Friday
        // Adjust so that 0=Sunday
        int dayOfWeek = (day + 6) % 7;
        return dayOfWeek;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n      " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = getDaysInMonth(month, year);

        // First loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces for each day
        }

        // Second loop for printing the days
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // Move to next line after Saturday
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}
