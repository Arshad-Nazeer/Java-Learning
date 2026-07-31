package L50_Polymorphism;

public class L50_Polymorphism {
    public static void main(String[] args) {
        // Polymorphism
        // "POLY" = "MANY"
        // "MORPH" = "SHAPE"
        // objects can identify as other objects
        // objects can be treated as objects of a common superclass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        // Car[] cars = {car, bike, boat};  // incompatible types
        // bike and boat does not identify as Car

        Vehicle[] vehicles = {car, bike, boat};
        // all three objects identify as objects of superclass
        // can also work with Vehicle as Interface

        for(Vehicle vehicle: vehicles)
            vehicle.go();


        // Polymorphism is the ability of an object to take many forms, allowing the same method call to produce different behavior depending on the object.
        // A parent class or interface reference can refer to objects of different child classes.
        // Instead of initializing different objects of different class, Different child class objects can be stored using parent class references, allowing them to be processed uniformly.

        Vehicle obj = new Car();
        obj.go();

        Vehicle obj2 = new Bike();
        obj2.go();

        Vehicle[] newvehicles = {new Car(), new Bike()};
        for(Vehicle vehicle: newvehicles)
            vehicle.go();
    }
}
