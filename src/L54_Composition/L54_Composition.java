package L54_Composition;

public class L54_Composition {
    public static void main(String[] args) {
        // Composition
        // Represents a "part of" relationship between objects
        // For example, An Engine is "part of" a Car
        // Allows complex objects to be constructed from smaller objects

        Car car = new Car("Mahindra", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine);
        // gives String representation of engine object
        System.out.println(car.engine.Type);

        car.start();

        // Car object is composed of Engine object
        // Engine is "part of" Car
        // Deleting car would delete engine object
        // The child object is usually created inside the parent.
        // Parent owns the child, and the child's lifecycle depends on the parent.
    }
}
