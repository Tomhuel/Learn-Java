package io.github.tomhuel.Models;

public class Computer {
    private String name;
    private String model;

    public Computer() {
    }

    public Computer(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
