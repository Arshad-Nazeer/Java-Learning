package L51_RuntimePolymorphism;

import java.util.Scanner;

public class L51_RuntimePolymorphism {
    public static void main(String[] args) {
        // Runtime Polymorphism (Dynamic Polymorphism)
        // When the method that gets executed is decided at runtime based on the actual type of object

        Scanner sc = new Scanner(System.in);

        Animal animal;
        // 'animal' is an Animal reference.
        // It can refer to either a Dog object or a Cat object.

        System.out.print("Would you like a dog or a cat? (1= dog, 2=cat): ");
        int choice = sc.nextInt();

        if(choice == 1) {
            animal=new Dog();
            animal.speak();
        }else if(choice == 2) {
            animal=new Cat();
            animal.speak();
        }
        // so the speak method called is decided at runtime
        // the animal object will identify as object of animal until user Input
    }
}
