package io.github.tomhuel.Collections.Set;

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

        students.add(new Student("Jack", 5));
        students.add(new Student("Tom", 10));
        students.add(new Student("Zendaya", 3));
        students.add(new Student("Chris", 8));
        students.add(new Student("Will", 9));

        System.out.println(students);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "[" + this.name + ", " + this.mark + "]";
    }

    @Override
    public int compareTo(Student o) {

        // By Mark
//        int result = this.mark - o.getMark();
//        if (result == 0) return 0;
//        return result > 0 ? 1 : (byte) -1;

        // By Name
        return this.name.compareTo(o.getName());
    }
}
