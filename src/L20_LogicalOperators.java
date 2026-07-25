import java.util.Scanner;

public class L20_LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators
        // They allow us to check or modify more than one conditions
        // they apply logical operations on conditions

        Scanner sc=new Scanner(System.in);

        double temp = 20;
        boolean sunny = true;

        if (temp <= 20 && temp >= 0 && sunny) {
            System.out.println("The weather is good 😀");
            System.out.println("It is sunny outside 🌞");
        }else if(temp<=30 && temp>=0 && !sunny){
            System.out.println("The weather is good 😀");
            System.out.println("It is cloudy outside ☁️");
        }else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad 👎");
        }

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;
        System.out.print("Enter your username: ");
        username = sc.nextLine();

        if(username.length()<4 || username.length()>12)
            System.out.println("username must be between 4-12 characters");
        else if(username.contains(" ") || username.contains("_"))
            System.out.println("username must not contain spaces or underscores");
        else
            System.out.print("Welcome! "+username);

        sc.close();
    }
}
