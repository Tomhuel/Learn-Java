package io.github.tomhuel.app.domain.form.validator.notnull;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;
import io.github.tomhuel.app.domain.form.validator.Validator;

public class NotNullValidator extends Validator {

    protected String message = "The field must not be null";

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean validate(ElementForm element) {
        return element.getValue() != null;
    }
}
