package io.github.tomhuel.interfaces.printer;

import io.github.tomhuel.interfaces.printer.Model.*;

public class Main {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Tony", "Farmer", "Sup! I'm Tony and i'm farmer!");
        cv.addExperience("How Carrots are born").addExperience("I know how to not cry against onions").addExperience("Red Hot Chilli Peppers it's my favourite group HELL YEAH!");

        Report report = new Report("Jimmy", "Jimmy", "NOCHES DE FANTASÍAAA, LAS QUE VIVÍ CON ELLAAAAA");

        Book book = new Book("Phil Collins", "Another day in Paradise", Genre.ACTION);
        book.addPage(new Page("Oh, think twice, 'cause it's another day for you and me in paradise")).addPage(new Page("Oh, think twice, 'cause it's another day for you")).addPage(new Page("You and me in paradise"));
        Printable.print(cv);
        Printable.print(report);
        Printable.print(book);
        System.out.println(Printable.defaultText);
    }
}
