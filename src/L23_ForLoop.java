import java.util.Scanner;

public class L23_ForLoop {
    public static void main(String[] args) throws InterruptedException {
        // For loop
        // execute some code a certain number of times

        for(int i=0; i<10; i++){
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);

        // Timer countdown
        System.out.print("How many seconds to countdown from? : ");
        int start=sc.nextInt();

        for(int i=start; i>=0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy World!");

        // Thread.sleep(1000) tells the current thread (your Java program) to pause for approximately 1000 milliseconds before continuing to the next statement. It doesn't stop the computer—just your program's current thread.

        // Note: Thread.sleep() requires handling or declaring InterruptedException because a sleeping thread can be interrupted by another thread before its sleep duration is complete. When this happens, Java throws an InterruptedException to notify the program that the thread was awakened early. Since it is a checked exception, the compiler requires you to either handle it using a try-catch block or declare it with throws InterruptedException. This design ensures that programs explicitly acknowledge and handle thread interruptions, which are an important part of Java's concurrency model.
    }
}
