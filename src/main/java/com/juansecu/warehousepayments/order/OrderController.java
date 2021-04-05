package com.juansecu.warehousepayments.order;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.juansecu.warehousepayments.product.Product;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {
    private List<Order> orders;

    @GetMapping("/delete-order")
    public String deleteOrder(
            @RequestParam(value = "productId") int productId
    ) {
        return "order-deleted";
    }

    @GetMapping("/edit-order")
    public String editOrder(
            @RequestParam(value = "productId") int productId
    ) {
        return "edit-order";
    }

    @GetMapping("/")
    public String newOrder(
            @RequestParam(value = "products") Product products[]
    ) {
        // 0.19 * (<valor-del-producto> + <valor-del-domicilio>)
        /*final Product product1 = new Product("Shampoo", "Shampoo para un cabello suave y sedoso", 10000);
        final Product product2 = new Product("Jabón", "Jabón para el cuerpo", 15000);
        final List<Product> products = Arrays.asList(product1, product2);*/
        final Order order = new Order(Arrays.asList(products.clone()));

        return "new-order";
    }
}
