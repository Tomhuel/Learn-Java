package io.github.tomhuel.interfaces.printer.Model;

import io.github.tomhuel.interfaces.printer.Model.Paper;

public class Page extends Paper {
    public Page(String content) {
        super(content);
    }

    @Override
    public String print() {
        return this.content;
    }
}
