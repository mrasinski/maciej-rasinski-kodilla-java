package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.shops.Shop;

import java.time.LocalDateTime;

public interface OrderRepository {

    void createOrder(Shop shop, LocalDateTime orderTime);

}
