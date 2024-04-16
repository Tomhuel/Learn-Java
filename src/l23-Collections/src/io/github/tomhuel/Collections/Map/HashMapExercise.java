package io.github.tomhuel.Collections.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
    public static void execute() {
        Map<String, Object> hm = new HashMap<>();

        hm.put("name", "John");
        hm.put("lastname", "Doe");
        hm.put("lastname", "Doe");
        hm.put("email", "johndoe@gmail.com");
        hm.put("age", 30);

        Map<String, String> address = new HashMap<>();
        address.put("street", "Hawk Street");
        address.put("number", "3");
        address.put("country", "United States of America");
        address.put("state", "Texas");
        address.put("city", "Houston");

        hm.put("address", address);

        System.out.println(hm);

        // Get
        System.out.println("hm.get(\"name\") = " + hm.get("name"));
        System.out.println(hm.getOrDefault("height", 180)); // if height doesn't exists, return 180 by default.

        // Update
        hm.replace("name", "Johnny"); // Replaces name to Johnny
        hm.replace("name", "Johnny", "John"); // Replaces the name to John of the actual name is Johnny
        System.out.println("name: " + hm.get("name"));

        // Remove
        System.out.println(hm.remove("email") + " deleted");
        hm.put("email", "johndoe@gmail.com");

        // Remove if the value matches (a doesn't match with johndoe@gmail.com so email won't be removed
        System.out.println(hm.remove("email", "a"));

        // Contains Key?
        System.out.println("Contains name key? " + hm.containsKey("name"));
        System.out.println("Contains height key? " + hm.containsKey("height"));

        // Contains Value?
        System.out.println("Contains name value? " + hm.containsValue("name"));
        System.out.println("Contains Doe value? " + hm.containsValue("Doe"));

        // Size of properties
        System.out.println("size: " + hm.size());

        // Get a Set with all Keys
        System.out.println(hm.keySet());

        // Get a Collection with all Values
        Collection<Object> values = hm.values();
        System.out.println(values);

        // Loop in a Map
        System.out.println();
        System.out.println("· for with Map.Entry");
        for (Map.Entry<String, Object> i : hm.entrySet()) {
            Object value = i.getValue();
            if (value instanceof Map) {
                System.out.println("key: " + i.getKey() + " => values: ");
                for (Map.Entry<?, ?> j : ((Map<?, ?>) i.getValue()).entrySet()) {
                    System.out.println("\t" + j.getKey() + " => " + j.getValue());
                }
            } else {
                System.out.println("key: " + i.getKey() + " => value: " + value);
            }
        }

        // For with KeySet
        System.out.println();
        System.out.println("· for with keySet");
        for (String key : hm.keySet()) {
            Object value = hm.get(key);
            if (value instanceof Map) {
                System.out.println("key: " + key + " => values: ");
                for (Object addKey : ((Map<?, ?>) value).keySet()) {
                    System.out.println("\t" + key + " => " + ((Map<?, ?>) value).get(addKey));
                }
            } else {
                System.out.println(key + " => " + value);
            }
        }

        // foreach
        System.out.println();
        System.out.println("· foreach");
        hm.forEach((key, value) -> {
            if (value instanceof Map) {
                System.out.println("key: " + key + " -> values: ");
                ((Map<?, ?>) value).forEach((addKey, addValue) -> {
                    System.out.println("\t" + key + " -> " + ((Map<?, ?>) value).get(addKey));
                });
            } else {
                System.out.println(key + " -> " + value);
            }
        });

        System.out.println();
        System.out.println("Printmap:");
        printMap(hm);

        // Clear all properties:
        hm.clear();
    }

    public static void printMap(Map<?, ?> m) {
        int tabs = 0;
        m.forEach((key, value) -> {
            if (value instanceof Map) {
                System.out.println("key: " + key + " -> values: ");
                printMap((Map<?, ?>) value, 1);
            } else {
                System.out.println(key + " -> " + value);
            }
        });
    }

    public static void printMap(Map<?, ?> m, int tabs) {
        StringBuilder tabString = new StringBuilder();
        for (int i = 0; i < tabs; i++) {
             tabString.append("\t");
        }
        m.forEach((key, value) -> {
            if (value instanceof Map) {
                System.out.println(tabString.toString() +  "key: " + key + " -> values: ");
                printMap((Map<?, ?>) value, tabs + 1);
            } else {
                System.out.println(tabString.toString() +  key + " -> " + value);
            }
        });
    }
}
