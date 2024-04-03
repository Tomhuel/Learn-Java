package io.github.tomhuel.interfaces.printer.Model;

public enum Genre {
    NOVEL("Novel"),
    DRAMA("Drama"),
    ACTION("Action"),
    TERROR("Terror"),
    SCIENCE("Science"),
    INVESTMENTS("Investments");


    private final String genre;
    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
