package io.github.tomhuel.school;

import java.util.Date;

public class Teacher extends Person {

    private Subject subject;

    public Teacher(String name, String lastname, Date birthdate, String email, Subject subject) {
        super(name, lastname, birthdate, email);
        this.subject = subject;
    }

    public Teacher(Person person, Subject subject) {
        super(person.getName(), person.getLastname(), person.getBirthdate(), person.getEmail());
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String greet() {
        String output = super.greet();
        return output + " i'm a teacher";
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
