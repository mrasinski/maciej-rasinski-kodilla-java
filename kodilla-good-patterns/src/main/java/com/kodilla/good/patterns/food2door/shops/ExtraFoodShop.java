package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.OrderService;
import com.kodilla.good.patterns.food2door.Product;

public class ExtraFoodShop extends Shop implements OrderService {

    public ExtraFoodShop(Product product) {
        super("ExtraFoodShop", product);
    }

    @Override
    public boolean process() {
        System.out.println(this.getShopName() + " provide unlimited resources so every order for " +
                this.getProduct().getProductName() + " will be accepted");
        return true;
    }
}
