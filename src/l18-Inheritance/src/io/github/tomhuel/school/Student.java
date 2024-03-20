package io.github.tomhuel.school;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person {

    protected String school;
    protected String course;
    protected Mark[] marks;
    protected Teacher[] teachers;

    public Student(String name, String lastname, Date birthdate, String email) {
        super(name, lastname, birthdate, email);
    }

    public Student(String name, String lastname, Date birthdate, String email, String school, String course, Mark[] marks, Teacher[] teachers) {
        super(name, lastname, birthdate, email);
        this.school = school;
        this.course = course;
        this.marks = marks;
        this.teachers = teachers;
    }

    public Student(Person person, String school, String course, Mark[] marks, Teacher[] teachers) {
        super(person.getName(), person.getLastname(), person.getBirthdate(), person.getEmail());
        this.school = school;
        this.course = course;
        this.marks = marks;
        this.teachers = teachers;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Mark[] getMarks() {
        return marks;
    }

    public void setMarks(Mark[] marks) {
        this.marks = marks;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public double marksAverage() {
        double total = 0.0;
        for (int i = 0; i < this.marks.length; i++) {
            total += this.marks[i].getMark();
        }
        return total / this.marks.length;
    }

    @Override
    public String greet() {
        String output = super.greet();
        return output + " i'm a student";
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat dcf = new DecimalFormat("#.##");
        String output = this.name + " " + this.lastname + " " + df.format(this.birthdate) + " " + this.email + "\n";
        output += this.school + " - " + this.course + "\n";
        output += "Teachers:\n";
        for (int i = 0; i < this.teachers.length; i++) {
            Teacher teacher = teachers[i];
            output += "\t" + teacher.getSubject().getName() + ": " + teacher.getName() + " " + teacher.getLastname() + " - " + teacher.getEmail() + "\n";
        }
        output += "Marks:\n";
        for (int i = 0; i < this.marks.length; i++) {
            Mark mark = marks[i];
            output += "\t" + mark.getSubject().getName() + ": " + dcf.format(mark.getMark()) + "\n";
        }
        output += "Average: " + dcf.format(this.marksAverage());
        return output;
    }
}
