package L61P_HangmanGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class L61P_HangmanGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word="";

        String filePath = "src\\L61P_HangmanGame\\words.txt";
        ArrayList<String> words = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String Line;
            while((Line = reader.readLine()) != null){
                words.add(Line.trim()); // to trim extra whitespaces
            }

        }catch(FileNotFoundException e){
            System.out.println("Could not find file");
        }catch(IOException e){
            System.out.println("Error reading file");
        }

        Random rand = new Random();
        word=words.get(rand.nextInt(words.size()));

        ArrayList<Character> wordState= new ArrayList<>();
        int wrongGuesses=0;

        for (int i = 0; i < word.length(); i++)
            wordState.add('_');

        System.out.println("*****************************");
        System.out.println("Welcome to JAVA Hangman Game!");
        System.out.println("*****************************");

        while(wrongGuesses<6){
            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");

            for (char c : wordState)
                System.out.print(c + " ");
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);

            if(word.indexOf(guess)!=-1) {
                System.out.println("CORRECT GUESS!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess)
                        wordState.set(i, guess);
                }

                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WON!");
                    System.out.println("The word was: "+word);
                    break;
                }
            } else {
                System.out.println("WRONG GUESS!");
                wrongGuesses++;
            }
        }

        if(wrongGuesses>=6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The Word was: "+word);
        }

        sc.close();
    }

    static String getHangmanArt(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                    o
                    
                    
                    """;
            case 2 -> """
                    o
                    |
                    
                    """;
            case 3 -> """
                    o
                   /|
                    
                    """;
            case 4 -> """
                    o
                   /|\\
                    
                    """;
            case 5 -> """
                    o
                   /|\\
                   / 
                    """;
            case 6 -> """
                    o
                   /|\\
                   / \\
                    """;
            default -> "";
        };
    }
}
