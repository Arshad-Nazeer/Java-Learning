// The Math class is a built-in (inbuilt) utility class in the java.lang package that provides a collection of static methods for performing common mathematical operations. Since all its methods are static, you do not need to create a Math object; they can be called directly using the class name
// everything in java.lang is imported automatically by the Java compiler.
// The class also provides useful mathematical constants like Math.PI and Math.E, making it a convenient utility for mathematical calculations in Java.

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Math.PI);
        System.out.println(Math.E); // Euler's Constant

        double result;

        result=Math.pow(3, 4);  // (base, exponent)
        System.out.println(result);

        result=Math.abs(-4567);
        System.out.println(result);

        result=Math.sqrt(9);
        System.out.println(result);

        result=Math.round(3.14);
        System.out.println(result);

        result=Math.ceil(3.14);
        System.out.println(result);

        result=Math.floor(-3.14);
        System.out.println(result);

        result=Math.max(10, 20);
        System.out.println(result);

        result=Math.min(10, 20);
        System.out.println(result);

        // finding hypotenuse
        double a, b, c;

        System.out.print("Enter the length of side A(cm): ");
        a = sc.nextDouble();
        System.out.print("Enter the length of side B(cm): ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse(side c) is : "+c+" cm");

        // finding circumference, area and volume of a circle
        System.out.print("Enter the radius of the circle(cm): ");
        double radius=sc.nextDouble();
        double area = Math.PI*Math.pow(radius, 2);
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);

        System.out.println("The circumference of the circle is: " + (Math.PI*2*radius) + " cm");

        System.out.println("The area of the circle is: " + String.format("%.2f", area) + " cm²");

        System.out.printf("The volume of the circle is: %.2f cm³\n", volume);

        sc.close();
    }
}
