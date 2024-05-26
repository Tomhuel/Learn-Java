package io.github.tomhuel.Models;

import io.github.tomhuel.Annotations.Init.Init;
import io.github.tomhuel.Annotations.JsonAttribute.JsonAttribute;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Product {
    @JsonAttribute()
    private String name;

    @JsonAttribute()
    private Double price;

    @JsonAttribute(name = "labels")
    private String[] tags;

    @Init()
    private void init() {
        this.name = Arrays.stream(this.name.split(" ")).map(c ->
                c.substring(0, 1).toUpperCase() + c.substring(1).toLowerCase()).collect(Collectors.joining(" "));
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

    public String[] getTags() {
        return tags;
    }

    public void setTags(String... tags) {
        this.tags = tags;
    }
}
