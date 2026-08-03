package L64_TimerTasks;

import java.util.Timer;
import java.util.TimerTask;

public class L64_TimerTasks {
    public static void main(String[] args){
        // Timer :-
        // Class that schedules tasks at specific times or periodically
        // Useful for: sending notification, scheduled updates, repetitive actions

        // TimerTask :-
        // Represents the task that will be executed by the TImer
        // You will extend the TimerTask class to define your task
        // Create a subclass of TimerTask and @Override run()
        // TimerTask is an abstract class. You must provide an implementation of run().

        // both are part of java.util

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            // this is a shortcut to define task instead of creating a subclass and overriding run() to define task
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };

        TimerTask task2 = new TimerTask(){
            // repeating this task indefinitely or #counter number of times
            int counter = 8;

            @Override
            public void run() {
                System.out.println("runs every second");
                counter--;
                if(counter<=0) {
                    System.out.println("Task Complete");
                    timer.cancel();
                    // Don't execute any more scheduled tasks for this Timer
                }
            }
        };

        // .schedule() Schedules a task to execute after a specified delay or repeatedly with a fixed delay between consecutive executions. If a task is delayed, future executions are also delayed.
        //Uses fixed delay scheduling.
        // Next execution is based on when the previous one finishes.
        // Delays accumulate over time.
        timer.schedule(task, 3000); // (task, delay in ms)

        // The execution time is simply how long the run() method takes to execute.
        // repeating task
        timer.schedule(task2, 3000, 1000); // (task, starting delay, interval)
    }
}
