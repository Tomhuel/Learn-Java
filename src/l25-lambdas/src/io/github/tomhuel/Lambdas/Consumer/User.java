package io.github.tomhuel.Lambdas.Consumer;

public class User {
    private String name;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "User {" +
                " name='" + name + "\' " +
                '}';
    }
}
