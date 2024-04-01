package io.github.tomhuel.app.domain.form.elementform;

import io.github.tomhuel.app.domain.form.elementform.label.Label;
import io.github.tomhuel.app.domain.form.validator.Validator;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementForm {

    protected String name;
    protected String value;
    protected List<Validator> validators = new ArrayList<>();
    protected List<String> errors = new ArrayList<>();

    public ElementForm() {
    }

    public ElementForm(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void addValidator(Validator validator) {
        this.validators.add(validator);
    }

    public void addValidator(Validator... validators) {
        for (Validator validator: validators) {
            this.addValidator(validator);
        }
    }

    public List<String> getErrors() {
        return this.errors;
    }


    public String printHtml(boolean withLabel) {
        if (withLabel) {
            return new Label(this.name).printHtml();
        }
        return "";
    }

    public boolean validate() {
        this.errors.clear();
        for (Validator validator : this.validators) {
            if (!validator.validate(this)) {
                this.errors.add(validator.getMessage());
            }
        }
        return this.errors.isEmpty();
    }

    abstract public String printHtml();
}
