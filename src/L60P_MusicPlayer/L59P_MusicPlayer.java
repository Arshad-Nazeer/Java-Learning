package L60P_MusicPlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.*;

public class L59P_MusicPlayer {
    public static void main(String[] args) {
        // How to play audio with java (.wav, .au, .aiff)

        String filepath = "src\\L60P_MusicPlayer\\A Caring Friend.wav";

        File file = new File(filepath);
        // creates a File object that represents the file located at the path stored in filepath.
        // A File object is a Java object that represents the path to a file or directory on your computer. It is not the file's contents.
        //Think of it as a file handle or a pointer to a location in the file system.

        Scanner sc = new Scanner(System.in);

        // we can use try with statement if an object implements AutoCloseable interface which scanner and AudioInputStream does but clip does not
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            // automatically closes the audioStream object
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){
                System.out.println("P: play");
                System.out.println("S: stop");
                System.out.println("R: reset");
                System.out.println("Q: quit");
                System.out.print("Enter your choice: ");

                response = sc.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");
                }
            }

            System.out.println("No problems detected");
        }catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }catch(IOException e){
            // act as safety net to catch any IOException errors
            System.out.println("Something went wrong");
        }finally{
            sc.close();
            System.out.println("Program Closed");
        }
    }
}
