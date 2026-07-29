import java.util.Random;
import java.util.Scanner;

public class L38P_SlotMachineProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 100, bet, payout;
        String[] row;
        String playAgain;

        System.out.println("************************");
        System.out.println("  Welcome to JAVA Slot  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("************************");

        while (balance > 0) {
            System.out.println("Current Balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = sc.nextInt();
            sc.nextLine(); // to clear input buffer


            if (bet > balance) {
                System.out.println("Insufficient Funds!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0!");
                continue;
            } else {
                balance -= bet;
            }

            System.out.println("Spinning.....");
            row = spinRow();
            printRow(row);
            payout=getPayout(row, bet);

            if(payout>0){
                System.out.println("You won $"+ payout);
                balance+=payout;
            }else{
                System.out.println("Sorry you lost this round!");
            }

            System.out.println("Do you want to play again? (Y/N)");
            playAgain=sc.nextLine().toUpperCase();

            if(playAgain.equals("N")) break;
        }

        System.out.println("GAME OVER! Your final score is: " + balance);

        sc.close();
    }

    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];

        Random rand=new Random();

        for(int i=0; i<3; i++){
            row[i]=symbols[rand.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join("|", row));
        // join strings of an array into one string using a delimiter
        System.out.println("**************");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1]) || row[1].equals(row[2])) return bet;
        return 0;
    }
}
