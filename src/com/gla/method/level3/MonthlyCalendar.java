package com.gla.methods.level3;

import java.util.Scanner;

public class MonthlyCalendar {

    // Month names
    static String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Days in months (non-leap year)
    static int[] days = {
            0,31,28,31,30,31,30,31,31,30,31,30,31
    };

    // Check leap year
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Get number of days in month
    static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year))
            return 29;
        return days[month];
    }

    // Gregorian calendar algorithm (Zeller-like)
    // returns 0=Sun, 1=Mon ... 6=Sat
    static int getFirstDay(int month, int year) {

        int m = month;
        int y = year;
        int d = 1; // first date of month

        int y0 = y - (14 - m) / 12;
        int x  = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        // Heading
        System.out.println("\n      " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int totalDays = getDaysInMonth(month, year);

        // -------- First loop : indentation --------
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces
        }

        // -------- Second loop : print dates --------
        for (int day = 1; day <= totalDays; day++) {

            System.out.printf("%3d ", day);

            // move to next line after Saturday
            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }

        sc.close();
    }
}
