package collection2;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToArrayList {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Convert keys to ArrayList
        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
       // System.out.println("Keys: " + keyList);

        // Convert values to ArrayList
        ArrayList<String> valueList = new ArrayList<>(map.values());
       // System.out.println("Values: " + valueList);

        // Convert key-value pairs (entries) to ArrayList
        ArrayList<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());
       // System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : entryList) {
           // System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        for(int i=0; i<keyList.size() && i<valueList.size(); i++) {
        	System.out.println(keyList.get(i)+" = "+valueList.get(i));
        }
    }
}
