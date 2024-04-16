package io.github.tomhuel;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {
    public static void execute() {
        List<String> al = new ArrayList<>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        // Get Amount of Elements (same as length in arrays)
        int amount = al.size();
        System.out.println(amount); // 5

        // Overwrite E to F
        al.add(4, "F");

        amount = al.size();
        System.out.println(amount); // 5

        // Remove a specified Value (use equals underground)
        al.remove("C");

        // Check if a elements it's already in the list:
        System.out.println(al.contains("A")); // true

        // Transform the List to an Array:
        Object[] a = al.toArray(new String[0]);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
