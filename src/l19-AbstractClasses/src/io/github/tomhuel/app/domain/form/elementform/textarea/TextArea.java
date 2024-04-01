package io.github.tomhuel.app.domain.form.elementform.textarea;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;

public class TextArea extends ElementForm {

    private int rows;
    private int cols;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public TextArea(String name, int rows, int cols) {
        super(name);
        this.rows = rows;
        this.cols = cols;
    }

    public TextArea(String name) {
        super(name);
    }

    @Override
    public String printHtml(boolean withLabel) {
        String input = "";
        if (withLabel) {
            input += super.printHtml(withLabel) + "\n";
        }
        input += this.printHtml();
        return input;
    }

    @Override
    public String printHtml() {
        String textarea = "<textarea name=\"" + this.name + "\" rows=\"" + this.rows + "\" cols=\"" + this.cols + "\">" + this.value + "</textarea>";
        return textarea;
    }
}
