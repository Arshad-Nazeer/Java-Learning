package L69_Threading;

import java.util.Scanner;

public class extendingThreadMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        sc.close();
    }
}