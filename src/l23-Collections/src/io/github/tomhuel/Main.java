package io.github.tomhuel;

import io.github.tomhuel.Collections.List.ArrayListComparator;
import io.github.tomhuel.Collections.List.LinkedListExercise;
import io.github.tomhuel.Collections.Map.HashMapExercise;
import io.github.tomhuel.Collections.Set.HashSetExercise;
import io.github.tomhuel.Collections.Set.SetLoops;
import io.github.tomhuel.Collections.Set.TreeSetExercise;

public class Main {
    public static void main(String[] args) {
        set();
        map();
        list();
    }

    public static void set() {
        // HashSet
//        HashSetExercise.execute();
//        HashSetExercise.findDuplicated();
//        HashSetExercise.customEquals();

        // Tree Set
//        TreeSetExercise.execute();
//        TreeSetExercise.comparable();

        // Set Loops
//        SetLoops.execute();
    }

    public static void list() {
//        ArrayListComparator.execute();
//        ArrayListExercise.execute();
//        LinkedListExercise.execute();
    }

    public static void map() {
        HashMapExercise.execute();
    }
}