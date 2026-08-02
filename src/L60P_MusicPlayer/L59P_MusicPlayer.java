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
        // its only a string

        File file = new File(filepath);
        // creates a File object that represents the file located at the path stored in filepath.
        // A File object is a Java object that represents the path to a file or directory on your computer. It is not the file's contents. package:- java.io
        //Think of it as a file handle or a pointer to a location in the file system. compatible with AudioSystem

        Scanner sc = new Scanner(System.in);

        // we can use try with statement if an object implements AutoCloseable interface which scanner and AudioInputStream does but clip does not
        // automatically closes the audioStream object
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            // AudioSystem: A utility class in Java's Sound API that provides static methods to load audio files, create audio resources (like Clip), and manage audio playback and formats.
            // The AudioInputStream class is a Java class in the javax.sound.sampled package that represents a stream of audio data that can be read sequentially from a supported audio source, such as a .wav, .au, or .aiff file, so it can be processed or played.
            // Clip is an interface that represents a preloaded audio player capable of playing, pausing, stopping, restarting, and looping a short audio clip stored in memory.
            // Al three are part of javax.sound.sampled
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

            //The process begins by specifying the audio file path as a String. A File object is then created from this path to represent the location of the audio file on the file system. Next, the static method AudioSystem.getAudioInputStream(file) opens the file, verifies that it is a supported audio format, and returns an AudioInputStream, which reads the audio data sequentially. An empty Clip (audio player) is then obtained using AudioSystem.getClip(). The audio data from the AudioInputStream is loaded into the Clip using clip.open(audioStream), after which the Clip can control playback through methods such as start(), stop(), setMicrosecondPosition(), loop(), and close().

            System.out.println("No problems detected");
        }catch(FileNotFoundException e){
            // Thrown when the specified file cannot be found.
            System.out.println("Could not locate file");
        }catch(UnsupportedAudioFileException e){
            // Thrown when the audio file exists but its format is not supported by Java's Sound API. AudioSystem.getAudioInputStream(file), found in javax.sound.sampled
            System.out.println("Audio file is not supported");
        }catch(LineUnavailableException e){
            // Thrown when Java cannot obtain an audio playback line (the system resource used to play sound). AudioSystem.getClip() , found in javax.sound.sampled
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
