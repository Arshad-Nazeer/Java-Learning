package L56_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class L56_ArrayLists {
    public static void main(String[] args) {
        // ArrayLists
        // ArrayList is part of the Java Collections Framework (JCF)
        // a resizable array that stores objects (stores primitive using autoboxing)
        // Arrays are fixed in size, but Arraylists can change(dynamic)

        // diamond operator to specify type of ArrayList, type of object to store
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(6.606);
        list2.add(2.71);
        System.out.println(list2);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");
        System.out.println(fruits);

        fruits.remove(1);
        fruits.remove("Coconut");
        System.out.println(fruits);

        fruits.set(0, "pineapple");
        System.out.println(fruits);

        System.out.println(fruits.get(1));
        System.out.println(fruits.size());

        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
