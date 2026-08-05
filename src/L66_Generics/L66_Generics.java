package L66_Generics;

import java.util.ArrayList;

public class L66_Generics {
    public static void main(String[] args) {
        // Generics
        // A concept where you can write a class, interface or method
        // that is compatible with different data types
        // <T> type parameter (placeholder that gets replaced with a real type)
        // can be multiple types <T, U>
        // <String> type argument (specified the type)

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);

        Box<String> box = new Box<>();
        box.setItem("Mercury");
        System.out.println(box.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(5);
        System.out.println(box2.getItem());

        Product<String, Double> product = new Product<>("PlayStation 5", 999.99);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());

        Product<String, Integer> product2 = new Product<>("microwave", 150);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
