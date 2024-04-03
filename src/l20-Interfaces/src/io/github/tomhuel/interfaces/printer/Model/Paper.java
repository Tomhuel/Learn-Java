package io.github.tomhuel.interfaces.printer.Model;

abstract public class Paper implements Printable {
    protected String content;

    public Paper(String content) {
        this.content = content;
    }

    abstract public String print();
}
