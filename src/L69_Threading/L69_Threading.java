package L69_Threading;

import java.util.Scanner;

public class L69_Threading {
    public static void main(String[] args) {
        // Threading
        // Allows a program to run multiple tasks simultaneously
        // Helps improve performance with time-consuming operations
        // code considered time consuming can be run on a different thread
        // (File I/O, network communications, or any background tasks)

        // A thread is the smallest unit of execution in a Java program. Multiple threads can run concurrently within the same process, sharing the same memory and resources while executing different tasks independently. Threads are mainly used to perform multiple operations at the same time, improving responsiveness and making better use of CPU resources.
        // Main thread is the default thread

        // How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable Interface (better)

        Scanner sc = new Scanner(System.in);

        System.out.println("You have 5 seconds to enter your name");
        System.out.print("Enter you name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);

        /*
        whole code is running on the same main thread, the main thread sleeps for 5 seconds and then proceed to the input code
          we need to distribute code between two different threads
          input on main thread
          countdown on another
        for(int i=1; i<=5; i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
                System.out.println("Thread was interrupted");
            }

            if(i==5)
                System.out.println("Time's Up");
        }

        System.out.print("You have 5 seconds to enter your name");
        System.out.print("Enter you name: ");
        name = sc.nextLine();
        System.out.println("Hello " + name);
        */

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // Daemon thread ends when main thread ends
        thread.start();

        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter you name: ");
        name = sc.nextLine();
        System.out.println("Hello " + name);

        sc.close();
    }
}
