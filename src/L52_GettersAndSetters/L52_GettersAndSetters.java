package L52_GettersAndSetters;

public class L52_GettersAndSetters {
    public static void main(String[] args) {
        // Getters :- methods that make a field Readable
        // Setters :- methods that make a field Writeable
        // They help protect object data and add rules for accessing or modifying them

        // Getters and setters are custom methods used to read (get) and modify (set) the value of private variables while maintaining encapsulation.

        Car car = new Car("Charger", "Yellow", 10000);

        System.out.println(car.getColor()+" "+car.getModel()+" "+car.getPrice());

        // car.color="Blue"; Invalid access, attributes not modifiable
        // car.price = 5000;  private access modifier

        car.setColor("Blue");
        car.setPrice(5000);
        car.setPrice(-99);

        System.out.println(car.getColor()+" "+car.getModel()+" "+car.getPrice());
    }
}
