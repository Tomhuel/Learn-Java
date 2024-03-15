package org.tomhuel.billapp.domain;

import java.text.DecimalFormat;

public class BillItem {
    private Product product;
    private Integer amount = 1;

    public BillItem(Product product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }

    public BillItem(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getTotalPrice() {
        return this.product.getPrice() * this.amount;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return this.product.getName() + " - Amount: " + this.amount + " - Price: " + df.format(this.getTotalPrice());
    }
}
