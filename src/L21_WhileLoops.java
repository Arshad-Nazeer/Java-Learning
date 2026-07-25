import java.util.Scanner;

public class L21_WhileLoops {
    public static void main(String[] args) {
        // while loop
        // repeat some code forever while some condition is true

        // Entering name
        Scanner sc = new Scanner(System.in);

        String name="";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name =  sc.nextLine();
        }
        System.out.println("Hello! "+name);

        // Playing a game
        String response="";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.println("Press Q to quit");
            response=sc.next().toUpperCase();
        }
        System.out.println("You have quit the game!");

        // Entering age
        int age=0;

        System.out.print("Enter your age: ");
        age=sc.nextInt();
        while(age<0){
            System.out.println("Invalid Input");
            System.out.print("Enter your age: ");
            age=sc.nextInt();
        }
        System.out.println("You are "+age+" years old.");

        // entering a number in a certain range

        int number=0;

        do{
            System.out.print("Enter a number between 1-10: ");
            number=sc.nextInt();
        }while(number<1 || number>10);
        System.out.println("You picked: " + number);

        sc.close();
    }
}
