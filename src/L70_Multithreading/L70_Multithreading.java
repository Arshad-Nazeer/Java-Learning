package L70_Multithreading;

public class L70_Multithreading {
    public static void main(String[]  args){
        // Multithreading
        // Enables a program to run multiple threads concurrently
        // Useful for background tasks or time consuming operations

        // Thread
        // A set of instructions that run independently

//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.start();
//
//        Thread thread2 = new Thread(new MyRunnable()); // anonymous class
//        thread2.start(); // Runs concurrently
//
        System.out.println("GAME START");

        PingPongRunnable PingPong = new PingPongRunnable("PING");
        Thread thread = new Thread(PingPong);
        Thread thread2 = new Thread(new PingPongRunnable("PONG"));

        thread.start();
        thread2.start();

        try{
            // join() causes the current thread to wait until the thread on which join() is called finishes execution.
            thread.join();
            thread2.join();
        }catch(InterruptedException e){
            System.out.println("GAME INTERRUPTED");
        }

        System.out.println("GAME OVER");

    }
}
