package com.juansecu.warehousepayments.product;

import lombok.Getter;

@Getter()
public class Product {
    private int productId;
    private final String name;
    private final String description;
    private final float price;
    private static int counter;

    public Product(String name, String description, float price) {
        this.productId = ++this.counter;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
