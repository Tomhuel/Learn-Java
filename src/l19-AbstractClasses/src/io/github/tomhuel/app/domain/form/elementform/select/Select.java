package io.github.tomhuel.app.domain.form.elementform.select;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;

import java.util.ArrayList;
import java.util.List;

public class Select extends ElementForm {

    private List<Option> options;

    public Select(String name) {
        super(name);
        this.options = new ArrayList<Option>();
    }

    public Select(String name, List<Option> options) {
        super(name);
        this.options = options;
    }

    public void addOption(Option option) {
        this.options.add(option);
    }

    public void addOption(String key, String value) {
        this.options.add(new Option(key, value));
    }

    public List<Option> getOptions() {
        return options;
    }

    @Override
    public String printHtml() {
        StringBuilder output = new StringBuilder();
        output.append("<select name=\"").append(this.name).append("\">\n");
        for (Option option : this.options) {
            output.append("\t<option value=\"").append(option.getValue()).append("\"");
            if (option.isSelected()) {
                output.append(" selected");
            }
            output.append(">").append(option.getKey()).append("</option>\n");
        }
        output.append("</select>\n");
        return output.toString();
    }

    public void selectOption(Option option) {
        for (Option optionloop: this.options) {
            optionloop.setSelected(false);
            if (optionloop.getKey().equals(option.getKey()) && optionloop.getValue().equals(option.getValue())) {
                optionloop.setSelected(true);
            }
        }
    }

    public void selectOption(String key) {
        for (Option optionloop: this.options) {
            optionloop.setSelected(false);
            if (optionloop.getKey().equals(key)) {
                optionloop.setSelected(true);
                this.value = optionloop.getValue();
            }
        }
    }

    @Override
    public String printHtml(boolean withLabel) {
        String output = "";
        if (withLabel) {
            output += super.printHtml(withLabel) + "\n";
        }
        output += this.printHtml();
        return output;
    }
}
