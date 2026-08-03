package L65P_CountdownTimer;

import java.util.Timer;
import java.util.TimerTask;

public class countdownTask extends TimerTask {
    int count;
    Timer timer;

    countdownTask(int response, Timer timer){
        this.count=response;
        this.timer=timer;
    }

    @Override
    public void run() {
        System.out.println(count);
        count--;
        if(count<0){
            System.out.println("Happy New Year!");
            timer.cancel();
        }
    }
}
