package io.github.tomhuel.app.domain.form.elementform.input;

public enum InputType {
    Text("text"),
    Password("password"),
    Number("number"),
    Email("email"),
    Checkbox("checkbox"),
    Radio("radio");

    private final String type;

    InputType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
