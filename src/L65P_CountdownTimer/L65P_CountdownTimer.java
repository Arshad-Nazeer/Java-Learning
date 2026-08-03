package L65P_CountdownTimer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class L65P_CountdownTimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seconds to countdown from: ");
        int response=sc.nextInt();

        Timer timer = new Timer();
        countdownTask task = new countdownTask(response, timer);

        // .scheduleAtFixedRate() Schedules a task to execute after a specified delay and then repeatedly at a fixed rate based on the original schedule. If a task is delayed, it attempts to catch up to maintain the intended timing.
        // 	Uses fixed rate scheduling.
        // Next execution is based on the original schedule, regardless of delays.
        // Tries to "catch up" if it falls behind.
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
