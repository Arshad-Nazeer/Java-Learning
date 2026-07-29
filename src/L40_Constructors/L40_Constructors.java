package L40_Constructors;

public class L40_Constructors {
    public static void main(String[] args) {
        // Constructor :-
        // A special method to initialize objects
        // You can pass arguments to a constructor and set up initial values
        // automatically called when creating an object

        // Student → Class (also the type of the reference variable)
        // student3 → Reference variable
        // new → Allocates memory for a new object on the heap
        // Student() → Calls the constructor to initialize the newly created object
        // = → Assigns the object's reference (memory address), not the object itself, to student3

        Student student1=new Student("Spongebob", 30, 3.2);
        Student student2=new Student("Patrick", 34, 1.5 );

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        Student student3=new Student("Sandy", 27, 4.0);
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
    }
}
