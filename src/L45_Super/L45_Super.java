package L45_Super;

public class L45_Super {
    public static void main(String[] args) {
        // super keyword :-
        // refers to the parent class (subclass <- superclass)
        // Used in constructors and method overriding
        // Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        person.showName();

        Student student = new Student("Harry", "Potter", 3.25);
        student.showName();
        System.out.println(student.gpa);
        student.showGPA();

        Employee emp=new Employee("Rubeus", "Hagrid", 50000);
        emp.showName();
        emp.showSalary();

        // When the parent constructor is parameterless, Java automatically calls it by inserting an implicit super(); as the first statement of the child constructor. However, if the parent constructor requires parameters, Java cannot call it automatically. In that case, the child constructor must explicitly use the super(...) keyword to pass the required arguments to the parent constructor.
        // The parent constructor initializes the inherited (parent) attributes, while the child constructor initializes the child-specific attributes. This ensures that the entire object is properly initialized.

    }
}
