package io.github.tomhuel.Models;

public class CPU {
    private Fabricator brand;
    private String model;

    public CPU(Fabricator brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Fabricator getBrand() {
        return brand;
    }

    public void setBrand(Fabricator brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
