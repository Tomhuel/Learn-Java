package io.github.tomhuel;

import io.github.tomhuel.Processors.JsonAttribute.JsonSerializer;
import io.github.tomhuel.Models.Product;

public class Main {
    public static void main(String[] args) {
        Product potatoes = new Product();
        potatoes.setName("Potatoes");
        potatoes.setPrice(2.3);
        String[] tags = {"Hello", "Fellas", "Howareu"};
        potatoes.setTags(tags);
        String json = JsonSerializer.apply(potatoes);
        System.out.println(json);
    }
}