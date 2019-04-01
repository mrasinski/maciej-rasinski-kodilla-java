package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.OrderService;
import com.kodilla.good.patterns.food2door.Product;

import java.time.LocalDateTime;

public class HealthyShop extends Shop implements OrderService {

    private int quantity;

    public HealthyShop(Product product, int quantity) {
        super("HealthyShop", product);
        this.quantity = quantity;
    }

    @Override
    public boolean process() {
        if (this.getProduct().getAmount() < quantity) {
            System.out.println(this.getProduct().getProductName() + " product was ordered on " +
                    LocalDateTime.now() + " from " + this.getShopName());
            return true;
        } else {
            System.out.println("Could not process order, not enough amount of " + this.getProduct().getProductName());
            return false;
        }
    }
}
