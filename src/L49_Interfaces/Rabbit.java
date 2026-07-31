package L49_Interfaces;

public class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("The rabbit is running away");
    }
}
