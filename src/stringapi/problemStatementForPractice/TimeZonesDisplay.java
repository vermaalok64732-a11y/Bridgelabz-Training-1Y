package stringApi.ProblemStatementsForPractice;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZonesDisplay {

    public static void main(String[] args) {

        // Create formatter to convert date-time to String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // GMT Time
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        String gmtString = gmtTime.format(formatter);

        // IST Time (Asia/Kolkata)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        String istString = istTime.format(formatter);

        // PST Time (America/Los_Angeles)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        String pstString = pstTime.format(formatter);

        // Display results
        System.out.println("Current Time in Different Time Zones:");
        System.out.println("GMT: " + gmtString);
        System.out.println("IST: " + istString);
        System.out.println("PST: " + pstString);
    }
}
