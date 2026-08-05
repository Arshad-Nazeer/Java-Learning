package L67_HashMaps;

import java.util.HashMap;

public class L67_HashMaps {
    public static void main(String[] args){    // HashMap
        // A data structure w\that stores key-value pairs
        // Keys are unique, but values can be duplicated
        // Does not maintain any order, but is memory efficient
        // HashMap<key, value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.75);
        map.put("orange", 1000000.00); // overwrites
        map.put("coconut", 1.00);
        System.out.println(map);

        map.remove("apple");
        System.out.println(map);

        System.out.println(map.get("orange"));

        System.out.println(map.containsKey("coconut"));
        System.out.println(map.containsKey("pineapple"));

        if(map.containsKey("coconut"))
            System.out.println(map.get("coconut"));
        else
            System.out.println("Key not found");

        System.out.println(map.containsValue(1000000)); // false (incorrect data type)
        System.out.println(map.containsValue(1000000.0)); // true

        System.out.println(map.size());

        for(String key: map.keySet()) // returns the keys in no guaranteed order
            System.out.println(key + ": $" + map.get(key));
    }
}
