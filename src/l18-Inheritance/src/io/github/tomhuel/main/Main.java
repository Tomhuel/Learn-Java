package io.github.tomhuel.main;

import io.github.tomhuel.school.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", new Date(), "johndoe@gmail.com");
        Mark[] marks = new Mark[3];
        Subject[] subjects = {
                new Subject("Web Development"),
                new Subject("Android Development"),
                new Subject("Embed Development")
        };
        marks[0] = new Mark(3.974893264873242, subjects[0]);
        marks[1] = new Mark(6.373289537298572, subjects[1]);
        marks[2] = new Mark(5.432869527985327, subjects[2]);
        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher("Mary", "Johnson", new Date(), "maryjohnson@harvard.usa", subjects[0]);
        teachers[1] = new Teacher("William", "Pinkerton", new Date(), "willpink@harvard.usa", subjects[1]);
        teachers[2] = new Teacher("Bob", "Squarepants", new Date(), "spongebob@harvard.usa", subjects[2]);
        Student student1 = new Student(person1, "Harvard", "3ºA", marks, teachers);
        System.out.println(student1);
        InternationalStudent intStudent = new InternationalStudent(student1, "Germany");
        System.out.println(intStudent);

        // Getting all parent classes
        Class intStudentClass = intStudent.getClass();
        System.out.println(intStudentClass);
        while (intStudentClass.getSuperclass() != null) {
            String children = intStudentClass.getName();
            String parent = intStudentClass.getSuperclass().getName();
            System.out.println("Children: " + children + " - Parent: " + parent);
            intStudentClass = intStudentClass.getSuperclass();
        }

        // Override custom functions
        Person pepe = new Person("Pepe", "Sánchez", new Date(), "pedrosanchezdimite@gmail.com");
        Student pepeStudent = new Student(pepe, "Moncloa", "Presi", marks, teachers);
        InternationalStudent pepiIntStudent = new InternationalStudent(pepeStudent, "ESPAÑA");
        Teacher pepiProfe = new Teacher(pepe, new Subject("Robo"));
        System.out.println(pepe.greet());
        System.out.println(pepeStudent.greet());
        System.out.println(pepiIntStudent.greet());
        System.out.println(pepiProfe.greet());
    }
}