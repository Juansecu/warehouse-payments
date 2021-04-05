package com.juansecu.warehousepayments.order;

import java.util.List;

import com.juansecu.warehousepayments.product.Product;

public class Order {
    private float subTotal;
    private final int orderId;
    private final List<Product> products;
    private final float totalFee;
    private final float iva = 0.19F;
    private final float shipFee = 6000;
    private static int counter;

    public Order(List<Product> products) {
        this.products = products;
        this.orderId = ++this.counter;

        this.products.forEach(product -> {
            this.subTotal += product.getPrice();
        });

        if (this.subTotal > 0 && this.subTotal < 100000)
            this.totalFee = this.iva * (this.subTotal + this.shipFee);
        else this.totalFee = this.iva * this.subTotal;
    }

    public int getOrderId() {
        return this.orderId;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public float getSubTotal() {
        return this.subTotal;
    }

    public float getShipFee() {
        return this.shipFee;
    }

    public float getTotalFee() {
        return this.totalFee;
    }
}
