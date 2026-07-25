import java.util.Random;
import java.util.Scanner;

public class L22P_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guess, attempts=0;
        int min=1, max=100;
        int randomNum=rand.nextInt(min, max);

        System.out.println("****Number Guessing Game****");
        System.out.printf("Guess a number between %d and %d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess=sc.nextInt();
            attempts++;
            if(guess<randomNum)
                System.out.println("TOO LOW! Try again");
            else if(guess>randomNum)
                System.out.println("TOO HIGH! Try again");
            else{
                System.out.println("Congratulations! The number was "+randomNum);
                System.out.println("Number of attempts: "+attempts);
            }
        }while(guess!=randomNum);

        System.out.println("You have WON! ");

        sc.close();
    }
}
