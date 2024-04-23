package io.github.tomhuel.Models;

public class Computer {
    private String name;
    private String model;
    private CPU cpu;

    public Computer() {
    }

    public Computer(String name, String model, CPU cpu) {
        this.name = name;
        this.model = model;
        this.cpu = cpu;
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

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
