package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<Integer, String> hashmap = new HashMap<>();
        System.out.println("first insert " + hashmap.put(1, "FIRST"));
        System.out.println("second insert " +hashmap.put(1, "FIRST"));

        for(Map.Entry<Integer, String> entry:  hashmap.entrySet()) {
            System.out.println("Hashmap value" + entry.getValue());
        }
    }
}
