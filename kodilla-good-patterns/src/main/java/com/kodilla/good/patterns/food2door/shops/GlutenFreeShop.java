package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.OrderService;
import com.kodilla.good.patterns.food2door.Product;

public class GlutenFreeShop extends Shop implements OrderService {

    public GlutenFreeShop(Product product) {
        super("GlutenFreeShop", product);
    }

    @Override
    public boolean process() {
        System.out.println(this.getShopName() + " is in renovation, please make an order after 2 days");
        return false;
    }
}
