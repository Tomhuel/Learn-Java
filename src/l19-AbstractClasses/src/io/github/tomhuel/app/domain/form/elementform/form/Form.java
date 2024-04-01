package io.github.tomhuel.app.domain.form.elementform.form;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;

import java.util.ArrayList;
import java.util.List;

public class Form extends ElementForm {

    private List<ElementForm> inputs = new ArrayList<ElementForm>();

    public Form addElement(ElementForm element) {
        this.inputs.add(element);
        return this;
    }

    public Form removeElement(String name) {
        for (int i = 0; i < this.inputs.size(); i++) {
            if (this.inputs.get(i).getName().equals(name)) {
                this.inputs.remove(i);
            }
        }
        return this;
    }

    @Override
    public String printHtml() {
        return this.printHtml(false);
    }

    @Override
    public String printHtml(boolean withLabel) {
        StringBuilder output = new StringBuilder();
        output.append("<form>\n");
        for (int i = 0; i < this.inputs.size(); i++) {
            ElementForm element = this.inputs.get(i);
            output.append("\t");
            output.append(element.printHtml(withLabel));
            if (this.inputs.size() - 1 != i) {
                output.append("\n");
            }
        }
        output.append("</form>");
        return output.toString();
    }

    @Override
    public boolean validate() {
        for (ElementForm input: inputs) {
            if (!input.validate()) {
                for (String error: input.getErrors()) {
                    this.errors.add(String.format("%s field: %s", input.getName(), error));
                }
            }
        }
        return this.errors.isEmpty();
    }
}
