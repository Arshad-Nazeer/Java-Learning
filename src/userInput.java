import java.util.Scanner;
// the Scanner class is used to read input from the user, a file, or another input source. It belongs to the java.util package.

public class userInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.in means input is taken from the keyboard.

        System.out.print("Enter the name of the user: ");
        String name=sc.nextLine();

        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa=sc.nextDouble();

        System.out.print("Are you a Student? (Yes/No) ");
        boolean isStudent=sc.nextBoolean(); //type in true or false

        // nextLine() is a method of Scanner and it reads an entire line of text entered by the user until they press Enter. It returns the input as a String, including spaces between words
        // next() reads until space


        System.out.println("Hello "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your gpa is "+gpa);

        if(isStudent)
            System.out.println("You are enrolled as a student");
        else
            System.out.println("You are NOT enrolled as a student");

        // note:- when you input an int or double before a string, the /n character is present in the input buffer which is taken as input to string on pressing enter
        int height=sc.nextInt();
        sc.nextLine(); // can be used right after int input to clear \n from input buffer
        String color=sc.nextLine();

        System.out.println("you are "+height+" cm tall");
        System.out.println("your favourite color is "+color);

        double width=0, height=0, area=0;
        System.out.print("Enter the width: ");
        width=sc.nextDouble();
        System.out.print("Enter the height: ");
        height=sc.nextDouble();

        area=width*height;

        System.out.println("The area is "+area+" cm²");



        sc.close();
        // not closing might lead to unexpected behaviour
        // Scanner is closed using close() to release the underlying input resource it is using (such as System.in for keyboard input or a file). When a Scanner is created, it establishes a connection to that resource, and calling close() tells Java that the resource is no longer needed, allowing the operating system to free it. This helps prevent resource leaks in long-running applications. However, if a Scanner is reading from System.in, closing it also closes the keyboard input stream, so no further input can be read from the keyboard in that program.
    }
}
