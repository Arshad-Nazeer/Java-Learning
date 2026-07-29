import java.util.Random;
import java.util.Scanner;

public class L37P_RockPaperScissorGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain="yes";

        do{
            System.out.print("Enter your move (Rock, Paper, Scissors): ");
            playerChoice = sc.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")) {
                System.out.println("invalid choice");
                continue;
            }

            computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice))
                System.out.println("It's a Tie!");
            else{
                switch(playerChoice){
                    case "rock":
                        System.out.println(computerChoice.equals("scissor") ? "You Win!" : "You Lose!");
                        break;
                    case "paper":
                        System.out.println(computerChoice.equals("rock") ? "You Win!" : "You Lose!");
                        break;
                    case "scissor":
                        System.out.println(computerChoice.equals("paper") ? "You Win!" : "You Lose!");
                        break;
                }
            }

            System.out.print("Play Again? (yes/no): ");
            playAgain = sc.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        sc.close();
    }
}
