package io.github.tomhuel.interfaces.printer.Model;

public class Report extends Paper {
    private String author;
    private String reviewer;
    public Report(String author, String reviewer, String content) {
        super(content);
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String print() {
        return "Report by: " + this.author + ". Reviewed by " + this.reviewer + ".\n" + this.content;
    }
}
