package L46_MethodOverriding;

public class L46_MethodOverriding {
    public static void main(String[] args) {
        // Method Overriding
        // When a subclass provides its own implementation of a method that is already defined
        // allows for code reusability and give specific implementation

        Dog dog=new Dog();
        Cat cat=new Cat();
        Fish fish=new Fish();

        dog.move();
        cat.move();
        fish.move();
        // the precedence of child methods is more than parent methods in case of method overriding
    }
}
