package L42_ArrayOfObjects;

public class L42_ArrayOfObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        // creating an empty array of type Class Car
        // Car[] cars = new Car[3];
        Car[] cars = {car1, car2, car3};

        for (Car car : cars) {
            car.drive();
        }

        for(int i=0; i<cars.length; i++) {
            cars[i].drive();
        }


        // creating array using anonymous objects which do not have a unqiue identifier
        Car[] newcars = {
                new Car("Mustang", "Red"),
                new Car("Corvette", "Blue"),
                new Car("Charger", "Yellow")
        };

        for(Car car : newcars) {
            car.color="black";
            car.drive();
        }
    }
}
