package io.github.tomhuel.interfaces.printer.Model;

import java.util.ArrayList;
import java.util.List;

public class Book implements Printable {
    private List<Paper> pages;
    private String author;
    private String title;
    private Genre genre;

    public Book(String author, String title, Genre genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pages = new ArrayList<>();
    }

    public Book addPage(Paper page) {
        this.pages.add(page);
        return this;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(this.title);
        sb.append("\nAuthor: ").append(this.author);
        sb.append("\nGenre: ").append(this.genre.getGenre());
        sb.append("\nPages: ");
        for (Paper page: this.pages) {
            sb.append("\n").append(page.print());
        }
        return sb.toString();
    }
}
