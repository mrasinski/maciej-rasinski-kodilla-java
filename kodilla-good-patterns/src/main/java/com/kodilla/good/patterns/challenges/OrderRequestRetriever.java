package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John", "Kowalski");
        Product product = new Product("Socks");
        LocalDateTime orderTime = LocalDateTime.now();

        return new OrderRequest(user, product, orderTime);
    }

}

