import java.util.Scanner;

public class L27_OverloadedMethods {
    public static void main(String args[]) {
        // overloaded methods :-
        // methods that share the same name but different parameters
        // unique method signature = name +  parameters

        System.out.println(add(1, 2));
        System.out.println(add(3, 4, 5));

        String pizza=bakePizza("Flat bread");
        System.out.println(pizza);

        String pizza2=bakePizza("Flat bread", "Mozarella");
        System.out.println(pizza2);

        String pizza3=bakePizza("Flat bread", "Mozarella", "Pepporoni");
        System.out.println(pizza3);
    }

    static double add(double a, double b) {
        return a+b;
    }

    static double add(double a, double b, double c) {
        return a+b+c;
    }

    static String bakePizza(String bread){
        return bread+" pizza";
    }

    static String bakePizza(String bread, String cheese){
        return cheese+" "+bread+" pizza";
    }

    static String bakePizza(String bread, String cheese, String topping){
        return topping+" "+cheese+" "+bread+" pizza";
    }
}
