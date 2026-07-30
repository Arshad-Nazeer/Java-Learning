package L46_MethodOverriding;

// child class
public class Fish extends Animal {
    // Annotations (@) are special markers in Java that provide extra information or instructions to the compiler or the Java runtime. They do not directly change the program's logic.
    // The compiler reports an error no method is being overridden if @override method does not match with any parent method
    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
}
