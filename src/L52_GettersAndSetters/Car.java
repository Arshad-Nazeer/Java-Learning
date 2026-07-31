package L52_GettersAndSetters;

public class Car {
    // private access modifier makes attributes inaccessible outside class
    // makes attributes publicly inaccessible, cannot be modified in main once declared

    // final makes the variable immutable, meaning its value can be assigned only once and cannot be changed afterward. not even by class's own methods, adds extra layer of security
    private final String model;
    private String color;
    private int price;

    Car(String model,String color,int price){
        this.model=model;
        this.color=color;
        this.price=price;
    }

    // getter methods
    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    String getPrice(){
        return "$"+this.price;
    }

    // setter methods
    void setColor(String color){
        this.color=color;
    }

    void setPrice(int price){
        if(price<=0) System.out.println("Price must be greater than 0");
        else this.price=price;
    }
}
