package io.github.tomhuel.app.domain.form.validator.required;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;
import io.github.tomhuel.app.domain.form.validator.Validator;

public class RequiredValidator extends Validator {

    protected String message = "The field is required";
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
        return element.getValue() != null && !element.getValue().isEmpty();
    }
}
