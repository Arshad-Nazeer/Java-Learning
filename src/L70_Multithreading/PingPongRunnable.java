package L70_Multithreading;

public class PingPongRunnable implements Runnable{
    private final String text;

    PingPongRunnable(String text){
        this.text=text;
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000); // current Threed sleeps for 1 sec
                System.out.println(Thread.currentThread().getName() +" "+this.text);
            }catch(InterruptedException e) {
                System.out.println(e.getMessage());
                System.out.println("Interrupted");
            }
        }
    }
}
