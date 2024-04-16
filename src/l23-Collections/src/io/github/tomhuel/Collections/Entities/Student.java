package io.github.tomhuel.Collections.Entities;

import java.util.Objects;

public class Student implements Comparable<Student> {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return mark == student.mark && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark);
    }
}
