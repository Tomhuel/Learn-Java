package io.github.tomhuel.app.domain.form.elementform.label;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;

public class Label extends ElementForm {

    public Label(String name) {
        super(name);
    }

    @Override
    public String printHtml() {
        return "<label>" + this.name + "</label>";
    }
}
