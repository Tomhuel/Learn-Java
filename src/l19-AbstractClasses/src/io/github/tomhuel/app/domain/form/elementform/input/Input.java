package io.github.tomhuel.app.domain.form.elementform.input;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;

public class Input extends ElementForm {

    private InputType type = InputType.Text;

    public Input(String name, InputType type) {
        super(name);
        this.type = type;
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
    }

    public void setValue(Integer value) {
        super.setValue(value.toString());
    }

    public Input(String name) {
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
        return "<input type=\"" + this.type + "\" name=\"" + this.name + "\" value=\"" + this.value + "\"/>";
    }

    public InputType getType() {
        return type;
    }

    public void setType(InputType type) {
        this.type = type;
    }
}
