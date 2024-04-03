import io.github.tomhuel.app.domain.form.elementform.FormMain;
import io.github.tomhuel.app.domain.form.elementform.form.Form;
import io.github.tomhuel.app.domain.form.elementform.input.Input;
import io.github.tomhuel.app.domain.form.elementform.input.InputType;
import io.github.tomhuel.app.domain.form.elementform.textarea.TextArea;
import io.github.tomhuel.app.domain.form.validator.ValidatorMain;
import io.github.tomhuel.app.domain.form.validator.email.EmailValidator;
import io.github.tomhuel.app.domain.form.validator.length.LengthValidator;
import io.github.tomhuel.app.domain.form.validator.notnull.NotNullValidator;
import io.github.tomhuel.app.domain.form.validator.numeric.NumericValidator;
import io.github.tomhuel.app.domain.form.validator.required.RequiredValidator;

import java.io.Serializable;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        FormMain.execute();
//        ValidatorMain.execute();

        // All together:

        // Validators
        NotNullValidator notNullValidator = new NotNullValidator();
        LengthValidator passwordValidator = new LengthValidator(8);
        LengthValidator aboutMeValidator = new LengthValidator(20, 50);
        NumericValidator numericValidator = new NumericValidator();
        RequiredValidator requiredValidator = new RequiredValidator();
        EmailValidator emailValidator = new EmailValidator();

        // Form Elements:
        Form form = new Form();
        Input username = new Input("username", InputType.Text);
        Input password = new Input("password", InputType.Password);
        Input email = new Input("email", InputType.Email);
        Input age = new Input("age", InputType.Number);
        TextArea aboutMe = new TextArea("aboutMe");

        // Add all elements to the form
        form.addElement(username).addElement(password).addElement(email).addElement(age).addElement(aboutMe);

        // Add validators to the elements:
        username.addValidator(notNullValidator, requiredValidator);
        password.addValidator(notNullValidator, passwordValidator, requiredValidator);
        email.addValidator(notNullValidator, emailValidator, requiredValidator);
        age.addValidator(numericValidator, requiredValidator);
        aboutMe.addValidator(aboutMeValidator, notNullValidator);
        aboutMe.setCols(10);
        aboutMe.setRows(5);

        // Time to set values
        username.setValue("Tom Holland");
        password.setValue("imcool1234");
        email.setValue("spiderman@gmail.gob");
        age.setValue(23);
        aboutMe.setValue("Hey! I'm Tom Holland! I am Spiderman >:)");

        // Validate time!
        form.validate();
        List<String> errors = form.getErrors();
        for (String error: errors) {
            System.out.println(error);
        }
        if (errors.isEmpty()) {
            System.out.println("All good ;)");
            System.out.println(form.printHtml(true));
        }
    }
}