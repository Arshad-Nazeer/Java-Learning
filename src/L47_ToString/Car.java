package L47_ToString;

public class Car {
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // toString() is public in the Object class. When overriding a method, you cannot reduce its access level, so the overridden toString() method must also be public.
    @Override
    public String toString(){
        return this.color+" "+this.year+" "+this.make+" "+this.model;
    }
}
