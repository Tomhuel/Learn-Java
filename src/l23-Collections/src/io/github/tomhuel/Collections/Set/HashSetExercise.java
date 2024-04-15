package io.github.tomhuel.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercise {
    public static void execute() {
        Set<String> hs = new HashSet<>();
        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add("4");
        hs.add("5");
        System.out.println(hs); // Doesn't have a specified order
        System.out.println(hs.add("3"));
        if (hs.contains("3")) hs.remove("3");
        hs.add("3");
        hs.forEach(e -> {
            System.out.println("e" + e);
        });
    }

    public static void findDuplicated() {
        String[] fishes = {
                "Muskalonga",
                "Sun's Fish",
                "Tuna",
                "SwordFish",
                "Lucio",
                "Salmon",
                "Muskalonga",
                "SwordFish",
        };
        Set<String> uniqueFishes = new HashSet<>();
        Set<String> duplicatedFishes = new HashSet<>();
        for (String fish: fishes) {
            // If fish already added, add to duplicated
            if (!uniqueFishes.add(fish)) duplicatedFishes.add(fish);
        }
        // Remove all the duplicated fishes in uniqueFishes
        uniqueFishes.removeAll(duplicatedFishes);

        System.out.println("Unique Fishes:");
        System.out.println(uniqueFishes);

        System.out.println("Duplicated Fishes:");
        System.out.println(duplicatedFishes);
    }
}
