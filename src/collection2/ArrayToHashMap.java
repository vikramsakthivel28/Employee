package collection2;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayToHashMap {

    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<String> keys = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();

        // Add data to the ArrayLists
        keys.add("Apple");
        keys.add("Banana");
        keys.add("Cherry");

        values.add(100);
        values.add(200);
        values.add(300);

        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Store ArrayList values into HashMap
        for (int i = 0; i < keys.size() && i < values.size(); i++) {
            map.put(keys.get(i), values.get(i));
        

        // Print the HashMap
       // System.out.println("HashMap contents:");
       // for (String key : map.keySet()) {
            System.out.println(keys.get(i) + " => " + values.get(i));
        }
        
            System.out.println(map);
        }
        
    }

