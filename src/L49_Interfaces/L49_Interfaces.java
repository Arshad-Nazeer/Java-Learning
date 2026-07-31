package L49_Interfaces;

public class L49_Interfaces {
    public static void main(String[] args) {
        // Interface :-
        // A blueprint for a class that specifies a set of abstract methods that implementing classes must define
        // supports multiple inheritance like behaviour
        // a class can have multiple parents
        // a class can implement more than one interface

        // The biggest practical difference is that an abstract class is used as a single parent class with shared code and data, while interfaces let a class acquire multiple independent abilities by implementing many interfaces.
        // An abstract class answers "What is this object?" (one parent), while an interface answers "What can this object do?" (many abilities).

        // An abstract class is used as a general blueprint for a group of closely related classes that share common data and behavior, whereas an interface is used to add a specific capability or behavior that any class can implement.

        // public is required because interface methods are implicitly public, and an overriding method cannot have a more restrictive access modifier.

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
