package io.github.tomhuel.school;

import java.util.Date;

// This class cannot have Children classes because its 'final' class.
public final class InternationalStudent extends Student {

    protected String country;

    public InternationalStudent(String name, String lastname, Date birthdate, String email, String school, String course, Mark[] marks, Teacher[] teachers, String country) {
        super(name, lastname, birthdate, email, school, course, marks, teachers);
        this.country = country;
    }

    public InternationalStudent(String name, String lastname, Date birthdate, String email, String country) {
        super(name, lastname, birthdate, email);
        this.country = country;
    }

    public InternationalStudent(Student student, String country) {
        super(student.name, student.lastname, student.birthdate, student.email, student.school, student.course, student.marks, student.teachers);
        this.country = country;
    }

    @Override
    public String greet() {
        String output = super.greet();
        return output + " from " + this.country;
    }

    @Override
    public String toString() {
        return "From " + this.country + "\n" + super.toString();
    }
}
