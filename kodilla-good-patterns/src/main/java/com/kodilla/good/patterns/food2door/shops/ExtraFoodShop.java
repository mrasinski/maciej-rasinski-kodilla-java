package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.OrderService;
import com.kodilla.good.patterns.food2door.Product;

import java.time.LocalDateTime;

public class ExtraFoodShop extends Shop implements OrderService {

    private boolean isOrdered;
    private int count = 5;

    public ExtraFoodShop(int amount) {
        super("ExtraFoodShop", new Product("Extra Food", amount));
    }

    @Override
    public boolean process(Shop shop, LocalDateTime orderTime) {

        if (this.getProduct().getAmount() > count) {
            isOrdered = false;
            return isOrdered;
        } else {
            count -= getProduct().getAmount();
            isOrdered = true;
            return isOrdered;
        }
    }
}
