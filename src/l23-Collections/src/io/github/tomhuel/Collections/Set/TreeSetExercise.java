package io.github.tomhuel.Collections.Set;

import io.github.tomhuel.Collections.Entities.Student;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExercise {
    public static void execute() {
        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("three");
        ts.add("four");
        ts.add("five");
        System.out.println("ts = " + ts);

        Set<Integer> numbers = new TreeSet<>((a, b) -> b.compareTo(a));
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("numbers = " + numbers);
    }

    public static void comparable() {
        Set<Student> students = new TreeSet<>();

        // The way that TreeSet checks if an Object is already added, is if compareTo == 0. CompareTo would be nice to compare a unique value like a Id.
        students.add(new Student("Jack", 5));
        students.add(new Student("Tom", 10));
        students.add(new Student("Zendaya", 3));
        students.add(new Student("Chris", 8));
        students.add(new Student("Will", 9));

        System.out.println(students);
    }
}

