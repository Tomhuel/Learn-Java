package io.github.tomhuel.app.domain.form.validator;

import io.github.tomhuel.app.domain.form.elementform.input.Input;
import io.github.tomhuel.app.domain.form.elementform.input.InputType;
import io.github.tomhuel.app.domain.form.validator.email.EmailValidator;
import io.github.tomhuel.app.domain.form.validator.length.LengthValidator;
import io.github.tomhuel.app.domain.form.validator.notnull.NotNullValidator;
import io.github.tomhuel.app.domain.form.validator.numeric.NumericValidator;
import io.github.tomhuel.app.domain.form.validator.required.RequiredValidator;

public class ValidatorMain {
    public static void execute() {
        Input input = new Input("email", InputType.Email);

        input.setValue("a@h.x");

        // Not Null Validator
        NotNullValidator notNullValidator = new NotNullValidator();
        System.out.println("Is not null " + notNullValidator.validate(input));

        // Required Validator
        RequiredValidator requiredValidator = new RequiredValidator();
        System.out.println("Value provided " + requiredValidator.validate(input));

        // Numeric Validator
        NumericValidator numericValidator = new NumericValidator();
        System.out.println("Is numeric " + numericValidator.validate(input));

        // Length Validator
        LengthValidator lengthValidator = new LengthValidator(2, 5);
        System.out.println("Is between " + lengthValidator.getMinLength() + " and " + lengthValidator.getMaxLength() + " of length " + lengthValidator.validate(input));
        System.out.println(lengthValidator.getMessage());

        // Email Validator
        EmailValidator emailValidator = new EmailValidator();
        System.out.println("Is a email " + emailValidator.validate(input));
    }
}
