package io.github.tomhuel.app.domain.form.validator;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;

public abstract class Validator {

    protected String name;
    abstract public String getMessage();
    abstract public void setMessage(String message);
    abstract public boolean validate(ElementForm element);
}
