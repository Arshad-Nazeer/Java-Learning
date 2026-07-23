public class L05_ArithmeticOperators {
    public static void main(String[] args) {
        int x=10, y=8, z;

        // Arithemtic Operators:- +, -, *, /, %
        z=x+y;
        System.out.println(z);
        z=x-y;
        System.out.println(z);
        z=x*y;
        System.out.println(z);
        z=x/y; // int won't retain decimal position
        System.out.println(z);
        z=x%y;
        System.out.println(z);

        // augmented assignment operators;
        x+=y; // same as x=x+y
        x-=y; //  same as x=x-y
        System.out.println(x);

        // increment and decrement operators
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        // order of operations: [P-E-M-D-A-S]
        // parentheseses -> exponents -> multiplication -> divison -> addition -> subtraction
        System.out.println(3+4*(7-5)/2.0);
    }
}
