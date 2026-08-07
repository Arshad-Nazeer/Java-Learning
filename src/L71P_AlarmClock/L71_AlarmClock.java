package L71P_AlarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class L71_AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime=null;
        String filepath = "src/L71P_AlarmClock/Ringtone.wav";


        while(alarmTime==null){
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = sc.nextLine();
                // Parse the string inputTime using formatter and assign the resulting LocalTime object to alarmTime.
                alarmTime = LocalTime.parse(inputTime, formatter);

                if (alarmTime.isBefore(LocalTime.now())) {
                    System.out.println("Alarm time must be in the future.");
                    alarmTime=null;
                    continue;
                }

                System.out.println("Alarm set for: " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid time format");
            }
        }

        // runs alarm clock on a separate thread
        AlarmClock alarmClock = new AlarmClock(alarmTime, filepath, sc);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
