package com.juansecu.warehousepayments.order;

import java.util.Arrays;
import java.util.List;

import com.juansecu.warehousepayments.product.Product;

public class OrderTests {
    public static void main(String[] args) {
        Product product1 = new Product("Shampoo", "Shampoo para un cabello suave y sedoso", 10000);
        Product product2 = new Product("Jabón", "Jabón para el cuerpo", 15000);
        List<Product> products = Arrays.asList(product1, product2);
        Order order1 = new Order(products);
        Order order2 = new Order(products);

        System.out.println(order1.getOrderId());
        System.out.println(order2.getOrderId());
    }
}
