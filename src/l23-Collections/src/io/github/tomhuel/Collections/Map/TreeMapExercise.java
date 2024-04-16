package io.github.tomhuel.Collections.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExercise {
    public static void execute() {
        // Orders by Keys.
        Map<String, Object> tm = new TreeMap<>(/*If we want reverse order or custom order: Comparator.reverseOrder() || (a, b) -> b.compareTo(a)*/);

        tm.put("name", "John");
        tm.put("lastname", "Doe");
        tm.put("lastname", "Doe");
        tm.put("email", "johndoe@gmail.com");
        tm.put("age", 30);

        Map<String, String> address = new TreeMap<>(Comparator.reverseOrder());
        address.put("street", "Hawk Street");
        address.put("number", "3");
        address.put("country", "United States of America");
        address.put("state", "Texas");
        address.put("city", "Houston");

        tm.put("address", address);

        System.out.println(tm);

        // Order of tm: address, age, email, lastname, name
        // Reverse Order of Address: street, state, number, country, city
    }
}
