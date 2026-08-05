package L69_Threading;

public class MyRunnable implements Runnable {
    // runs on separate thread
    @Override
    public void run() {
        for(int i=1; i<=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                System.out.println("Thread was interrupted");
            }

            if (i==10){
                System.out.println("Time's Up");
                System.exit(0);
            }
        }
    }
}
