package L44_Inheritance;

// GrandParent Class
public class Organism {
    boolean isAlive;

    Organism(){
        isAlive = true;
        // The compiler knows that isAlive refers to the instance variable because there is no local variable or parameter named isAlive.
        //therefore, this keyword is not required
    }
}
