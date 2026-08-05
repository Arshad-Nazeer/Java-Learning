package L70_Multithreading;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000); // current Threed sleeps for 1 sec
                System.out.println(Thread.currentThread().getName() +" "+i);
            }catch(InterruptedException e) {
                System.out.println(e.getMessage());
                System.out.println("Interrupted");
            }
        }
    }
}
