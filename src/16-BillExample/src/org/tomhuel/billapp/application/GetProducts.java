package org.tomhuel.billapp.application;

import org.tomhuel.billapp.domain.Product;

import java.util.ArrayList;

public class GetProducts {
    public static ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            products.add(new Product("Product " + i, (i + 0.99)));
        }
        return products;
    }
}
