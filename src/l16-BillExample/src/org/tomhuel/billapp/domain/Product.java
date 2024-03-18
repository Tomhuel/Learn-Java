package org.tomhuel.billapp.domain;

public class Product {
    private Integer id;
    private String name;
    private Double price;

    private static Integer lastId = 1;

    public Product(String name, Double price) {
        this.id = lastId++;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
