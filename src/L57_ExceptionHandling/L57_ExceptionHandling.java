package L57_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L57_ExceptionHandling {
    public static void main(String[] args) {
        // Exception
        // An event that interrupts the normal flow of a program
        // (dividing by zero, file not found, mismatch input type)
        // Surround any dangerous code with try{} block
        // User input and locating external resources are almost always dangerous codes
        // try{}, catch{}, finally{}



        try{
            System.out.println(1 / 0);
        }catch(ArithmeticException e){
            System.out.println(e);  // return string representation
            System.out.println(e.getMessage()); // returns the error message
            System.out.println("You CAN'T divide by zero");
        }

        // getMessage() is a method of the Throwable class (the parent of all exceptions).
        // It returns only the descriptive error message, without the exception type.

        //e is the exception object that Java creates when an error occurs.
        // Think of e as an object containing information about the error, such as:
        // The type of exception (ArithmeticException)
        // The error message (/ by zero)
        // The stack trace (where the error happened)

        // A try-with-resources statement automatically closes resources (such as files, scanners, or streams) when the try block finishes, even if an exception occurs.
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number);
        }catch(InputMismatchException e){  // needs to be imported
            System.out.println(e.getMessage());
            System.out.println("That wasn't a number");
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero");
        }catch(Exception e){
            // Safety Met
            // Exception is the parent class for most exceptions
            // it represents any exception that is not more specific.
            // Catch any object whose type is Exception or any subclass of Exception.
            System.out.println("Something went wrong");
        }finally{
            // sc.close();
            System.out.println("This always Executes");
        }

        // The finally block contains code that always executes, whether an exception occurs or not, and is typically used to clean up resources (e.g., closing files, database connections, or scanners).
    }
}
