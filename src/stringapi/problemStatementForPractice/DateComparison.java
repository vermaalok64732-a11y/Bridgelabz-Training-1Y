package stringApi.ProblemStatementsForPractice;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input first date
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String dateStr1 = scanner.nextLine();

        // Input second date
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String dateStr2 = scanner.nextLine();

        // Convert String to LocalDate
        LocalDate date1 = LocalDate.parse(dateStr1);
        LocalDate date2 = LocalDate.parse(dateStr2);

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is BEFORE the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is AFTER the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME.");
        }

        scanner.close();
    }
}
