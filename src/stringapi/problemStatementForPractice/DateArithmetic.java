package stringApi.ProblemStatementsForPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input date as String
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Perform date arithmetic
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        // Convert result to formatted String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String result = updatedDate.format(formatter);

        // Display result
        System.out.println("Final Date after calculations: " + result);

        scanner.close();
    }
}
