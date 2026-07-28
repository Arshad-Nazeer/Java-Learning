import java.util.Scanner;

public class L36P_QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was facebook launched?",
                "Who is known as the father of computers?",
                "What was the first programming language?"
        };

        String[][] options = {
                {"1. Storing Files", "2. Encrypting Data", "3. Directing internet traffic", "4. Managing Passwords"},
                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1. COBOL", "2. C", "3. Fortran", "Assembly"}
        };

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        System.out.println("******************************");
        System.out.println("Welcome to the JAVA Quiz Game!");
        System.out.println("******************************");

        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);

            for(String option: options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess=sc.nextInt();
            if(guess==answers[i]) {
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }else{
                System.out.println("**********");
                System.out.println("INCORRECT!");
                System.out.println("**********");
            }
        }

        System.out.println("Your Final Score is: "+score+"/"+questions.length);

        sc.close();
    }
}
