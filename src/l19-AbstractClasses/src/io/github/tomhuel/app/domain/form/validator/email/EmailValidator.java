package io.github.tomhuel.app.domain.form.validator.email;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;
import io.github.tomhuel.app.domain.form.validator.Validator;

public class EmailValidator extends Validator {

    private final static String emailRegExp = "^(.+)@(.+)$";
    protected String message = "The field must be a email";
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
        return element.getValue().matches(EmailValidator.emailRegExp);
    }
}
