package io.github.tomhuel.school;

import java.util.Date;

public class Person {

    protected String name;
    protected String lastname;
    protected Date birthdate;
    protected String email;

    public Person(String name, String lastname, Date birthdate, String email) {
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String greet() {
        return "hello";
    }

    // We cannot override this method because has 'final'
    public final String sayMyName() {
        return this.name;
    }
}
