// The Math class is a built-in (inbuilt) utility class in the java.lang package that provides a collection of static methods for performing common mathematical operations. Since all its methods are static, you do not need to create a Math object; they can be called directly using the class name
// everything in java.lang is imported automatically by the Java compiler.
// The class also provides useful mathematical constants like Math.PI and Math.E, making it a convenient utility for mathematical calculations in Java.

public class MathClass {
    public static void main(String[] args) {
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
    }
}
