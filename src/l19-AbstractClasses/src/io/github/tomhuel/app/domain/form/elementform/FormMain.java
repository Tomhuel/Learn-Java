package io.github.tomhuel.app.domain.form.elementform;

import io.github.tomhuel.app.domain.form.elementform.form.Form;
import io.github.tomhuel.app.domain.form.elementform.input.*;
import io.github.tomhuel.app.domain.form.elementform.select.*;
import io.github.tomhuel.app.domain.form.elementform.textarea.TextArea;

import java.util.ArrayList;

public class FormMain {
    public static void execute() {
        // Input Type
        Input textInput = new Input("username", InputType.Text);
        Input passwordInput = new Input("password", InputType.Password);
        Input emailInput = new Input("email", InputType.Email);
        Input numberInput = new Input("number", InputType.Number);
        textInput.setValue("Tom");
        passwordInput.setValue("My epic Password!");
        emailInput.setValue("example@example.com");
        numberInput.setValue(23);

        // Textarea
        TextArea textArea = new TextArea("about-me", 5, 30);
        textArea.setValue("Hey there! I'm Tom!");

        // Select
        Select select = new Select("role", new ArrayList<>());
        Option admin = new Option("Admin", "admin");
        select.addOption(admin);
        select.addOption("User", "user");
        select.addOption("Moderator", "moderator");
        select.addOption("Tester", "tester");
        select.selectOption("Moderator");

        // Form
        Form form = new Form();

        form.addElement(textInput).addElement(passwordInput).addElement(emailInput).addElement(numberInput);
        form.addElement(textArea);
        form.addElement(select);
        System.out.println(form.printHtml(true));

        // Anonymous Classes
        ElementForm span = new ElementForm() {
            @Override
            public String printHtml() {
                return "<span>" + this.value + "</span>";
            }
        };

        span.setValue("Hello Span!");
        System.out.println(span.printHtml());
    }
}
