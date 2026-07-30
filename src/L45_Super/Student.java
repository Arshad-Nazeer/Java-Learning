package L45_Super;

// child class
public class Student extends Person {
    double gpa;

    Student(String fname, String lname, double gpa){
        super(fname, lname);
        this.gpa=gpa;
    }

    void showGPA(){
        System.out.println(this.fname+"'s gpa is "+this.gpa);
    }
}
