package L40_Constructors;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa ) {
        // this refers to the object currently calling the constructor
        // if student1 is calling, it is same as student1.name
        this.name=name;
        this.age=age;
        this.gpa=gpa;
        this.isEnrolled=true;
    }

    void study(){
        System.out.println(this.name+" is studying");
    }
}
