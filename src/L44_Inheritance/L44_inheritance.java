package L44_Inheritance;

public class L44_inheritance {
    public static void main(String[] args) {
        // Inheritance :-
        // One class inherits attributes and methods from another class.
        // Child <- Parent

        // Every time you create an object of a child class, the parent class constructor is called first.
        Dog dog = new Dog();
        Cat cat = new Cat();

        // attribute inherited from parent class
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        // method inherited from parent class
        dog.eat();
        cat.eat();

        // child attribute
        System.out.println(dog.lives);
        System.out.println(cat.lives);

        // child method
        dog.speak();
        cat.speak();

        // multi level inheritance :- child <- parent <- grandparent

        //parallel inheritance:- (Animal, Plant) <- Organism
        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthesis();
    }
}
