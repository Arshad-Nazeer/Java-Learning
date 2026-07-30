package L48_Abstraction;

public class L48_Abstraction {
    public static void main(String[] args) {
        // abstract :-
        // Used to define abstract classes and methods
        // Abstraction is the process of hiding implementation details and showing only the essential features
        // Abstract classes CAN'T be instantiated directly
        // Can contain 'abstract' methods (which must be implemented)
        // Can contain 'concrete' methods (which are inherited)
        // So the main purpose of abstract classes and methods is to define a common template and force all subclasses to implement the methods that are specific to them.

        // Shape shape=new Shape(); abstract class cannot be instantiated
        // the abstract class is too generic, user need to instantiate a type of abstract class not abstract class itself

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
