package io.github.tomhuel.repositoryinterface.Product.Entity;

import io.github.tomhuel.repositoryinterface.BaseEntity.BaseEntity;
import io.github.tomhuel.repositoryinterface.Client.Entity.Client;

import java.util.Objects;

public class Product extends BaseEntity implements Comparable {
    private String name;
    private String description;
    private Double price;

    public Product(String name, String description, Double price) {
        super();
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String ClassName = this.getClass().getName();
        String output = ClassName.substring(ClassName.lastIndexOf(".") + 1) + " {";
        output += "\n\tId: " + this.id + ",";
        output += "\n\tName: " + this.name + ",";
        output += "\n\tDescription: " + this.description + ",";
        output += "\n\tPrice: " + this.price.toString();
        output += "\n}";
        return output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(this.name, product.name) && Objects.equals(this.description, product.description) && Objects.equals(this.price, product.price);
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof Product)) {
            throw new IllegalArgumentException("A Product must be provided");
        }
        Product product = (Product) obj;
        return this.id.compareTo(product.getId());
    }
}
