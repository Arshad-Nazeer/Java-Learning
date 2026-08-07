package L71P_AlarmClock;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{
    private final LocalTime alarmTime;
    private final String filepath;
    private final Scanner sc;

    AlarmClock(LocalTime alarmTime, String filepath, Scanner sc) {
        this.alarmTime = alarmTime;
        this.filepath = filepath;
        this.sc = sc;
    }

    @Override
    public void run(){
        while(LocalTime.now().isBefore(alarmTime)){
            try{
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                // \r is the carriage return character
                // It moves the cursor back to the beginning of the current line without moving to a new line.
                // overwrites old text
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            }catch(InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }

        System.out.println("\n****Alarm Noises****");
        // Toolkit.getDefaultToolkit().beep(); //plays a beep

        playSound(filepath);
    }

    private void playSound(String filepath){
        try{
            File audioFile = new File(filepath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("*Press *Enter* to stop the alarm: ");
            sc.nextLine();
            clip.stop();

            sc.close();
            // closing scanner once closes System.in everywhere
        }catch(UnsupportedAudioFileException e){
            System.out.println("Audio File Format is not supported");
        }catch(LineUnavailableException e){
            System.out.println("Resource unavailable");
        }catch(IOException e){
            System.out.println("Error reading audio file");
        }
    }
}
