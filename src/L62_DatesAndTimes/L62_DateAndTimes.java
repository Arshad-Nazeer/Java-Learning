package L62_DatesAndTimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class L62_DateAndTimes {
    public static void main(String[] args) {
        // How to work with dates and times using java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
        // LocalDate, LocalTime, LocalDateTime, Instant, and DateTimeFormatter are immutable value classes in the java.time package. They represent dates, times, timestamps, and formatting rules.
        // UTC (Coordinated Universal Time) is the world's standard reference time. Every country's local time is defined as an offset from UTC.

        // gives currrent date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // gives current time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // gives current Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // gives utc time
        // Instant.now() gives you the current time in UTC+00:00.
        Instant instant = Instant.now();
        System.out.println(instant);

        // ofEpochSecond(...) creates an Instant from the number of seconds since the Unix Epoch.
        // It is a fixed starting point in time: 1970-01-01T00:00:00Z
        Instant unixEpoch = Instant.ofEpochSecond(0);
        System.out.println(unixEpoch);

        // Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // refer to java documentation
        // acts like template that tells Java how to display the date and time.
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // custom date
        LocalDate customDate = LocalDate.of(2024, 12, 25);
        System.out.println(customDate);

        LocalDateTime customDateTime = LocalDateTime.of(2024, 12, 25, 0, 0);
        // omits arguments not mentioned
        System.out.println(customDateTime);

        if(date.isBefore(customDate))
            System.out.println(date+" is earlier than "+customDate);
        else if(date.isAfter(customDate))
            System.out.println(date+" is later than "+customDate);
        else if(date.isEqual(customDate))
            System.out.println(date+" is equal to "+customDate);

    }
}
