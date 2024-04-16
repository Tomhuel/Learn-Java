package io.github.tomhuel.Collections.List;

import io.github.tomhuel.Collections.Entities.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListComparator {
    public static void execute() {
        List<Student> sl = new ArrayList<>();

        sl.add(new Student("", 1));
        sl.add(new Student("", 7));
        sl.add(new Student("", 3));
        sl.add(new Student("", 5));
        sl.add(new Student("", 9));
        sl.add(new Student("", 2));

        // Sort:
        Collections.sort(sl);
        Collections.sort(sl, Student::compareTo);
        Collections.sort(sl, (a, b) -> a.compareTo(b));
        sl.sort((a, b) -> a.compareTo(b));
        sl.sort((a, b) -> {
            return a.compareTo(b);
        });
        sl.sort(Student::compareTo);
        // Java 8
        sl.sort(Comparator.comparing((Student::getName)));

        // Reverse Sort:
        Collections.sort(sl);
        Collections.sort(sl, Collections.reverseOrder());
        Collections.sort(sl, (a, b) -> b.compareTo(a));
        sl.sort((a, b) -> b.compareTo(a));
        sl.sort((a, b) -> {
            return b.compareTo(a);
        });
        // Java 8
        sl.sort(Comparator.comparing(Student::getName).reversed());
    }
}
