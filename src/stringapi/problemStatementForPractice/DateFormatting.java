package stringApi.ProblemStatementsForPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public static void main(String[] args) {

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Define different format patterns
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Convert to String using formatters
        String date1 = currentDate.format(format1);
        String date2 = currentDate.format(format2);
        String date3 = currentDate.format(format3);

        // Display results
        System.out.println("Current Date in Different Formats:");
        System.out.println("dd/MM/yyyy: " + date1);
        System.out.println("yyyy-MM-dd: " + date2);
        System.out.println("EEE, MMM dd, yyyy: " + date3);
    }
}
