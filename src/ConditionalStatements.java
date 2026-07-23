import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // if statement:- performs a block of code if its condition is true

        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent=sc.nextBoolean();

        if(name.isEmpty()) System.out.println("You didn't enter your name 😡");
        else System.out.println("Hello "+name+" 😊");

        if(age>=65)
            System.out.println("you are an unc! 👴");
        else if(age>=18)
            System.out.println("You are an adult! 👨‍🦱");
        else if(age<=0)
            System.out.println("You haven't been born yet! ⁉️");
        else if(age==0)
            System.out.println("You are an infant! 🍼");
        else
            System.out.println("You are an NOT an adult! 🧒");

        if(isStudent){
            System.out.println("You are a Student 🤓");
        }else{
            System.out.println("You are NOT a Student 😎");
        }

        sc.close();
    }
}
