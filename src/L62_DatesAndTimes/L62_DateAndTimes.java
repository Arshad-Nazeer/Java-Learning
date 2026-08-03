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
        Instant instant = Instant.now();
        System.out.println(instant);

        // Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // custom date
        LocalDate customDate = LocalDate.of(2024, 12, 25);
        System.out.println(customDate);

        LocalDateTime customDateTime = LocalDateTime.of(2024, 12, 25, 0, 0);
        // omits arguement not mentioned
        System.out.println(customDateTime);

        if(date.isBefore(customDate))
            System.out.println(date+" is earlier than "+customDate);
        else if(date.isAfter(customDate))
            System.out.println(date+" is later than "+customDate);
        else if(date.isEqual(customDate))
            System.out.println(date+" is equal to "+customDate);

    }
}
