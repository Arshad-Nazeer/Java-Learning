package L47_ToString;

public class L47_ToString {
    public static void main(String[] args) {
        // .toString() :-
        // The Object class is the root (topmost) class in Java. The Object class is the parent class of all classes in Java. Every class in Java directly or indirectly inherits from Object. It provides common methods that every object can use.
        // Method inherited from the Object class
        // It is automatically called when we print an object using System.out.println(object)
        // Used to return a string representation of an object
        // By default, it returns a hash code as a unique identifier
        // it can be overridden to provide meaningful details

        Car car = new Car("Ford", "Mustang", 2025, "red");

        System.out.println(car);
        // return a unique identifier for the object which uses object's reference(memory address) to calculate a hash code

        System.out.println(car.color+" "+car.year+" "+car.make+" "+car.model);
        // gives meaningful detail

        System.out.println(car);

        Car car2 = new Car("Chevrolet", "Corvette", 2026, "blue");
        System.out.println(car2);
    }
}
