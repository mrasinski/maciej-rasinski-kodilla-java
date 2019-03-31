package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.OrderService;
import com.kodilla.good.patterns.food2door.Product;

import java.time.LocalDateTime;

public class GlutenFreeShop extends Shop implements OrderService {

    public GlutenFreeShop(String shopName, Product product) {
        super(shopName, product);
    }

    @Override
    public boolean process(Shop shop, LocalDateTime orderTime) {
        return false;
    }
}
