package io.github.tomhuel.app.domain.form.validator.length;

import io.github.tomhuel.app.domain.form.elementform.ElementForm;
import io.github.tomhuel.app.domain.form.validator.Validator;

public class LengthValidator extends Validator {

    protected Integer minLength = 0;
    protected Integer maxLength = Integer.MAX_VALUE;
    protected String message = "";

    public LengthValidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.setMessage();
    }

    public LengthValidator(int minLength) {
        this.minLength = minLength;
        this.setMessage();
    }

    public LengthValidator() {
        this.setMessage();
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    private void setMessage() {
        setMessage(String.format("This field must be at least with %d and maximum %d characters of length", this.minLength, this.maxLength));
    }

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
        if (maxLength == null) {
            return element.getValue().length() >= minLength;
        }
        return element.getValue().length() <= this.maxLength && element.getValue().length() >= this.minLength;
    }
}
