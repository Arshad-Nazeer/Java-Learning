package L54_Composition;

public class Engine {
    String Type;

    Engine(String Type){
        this.Type=Type;
    }

    void start(){
        System.out.println("You start the "+this.Type+" engine");
    }
}
