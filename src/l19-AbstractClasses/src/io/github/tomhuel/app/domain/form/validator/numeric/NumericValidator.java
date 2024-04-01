package io.github.tomhuel.app.domain.form.validator.numeric;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;
import io.github.tomhuel.app.domain.form.validator.Validator;

public class NumericValidator extends Validator {
    protected String message = "The field must be a number";

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
        try {
            Integer.parseInt(element.getValue());
            return true;
        } catch (Exception exp) {
            return false;
        }
    }
}
