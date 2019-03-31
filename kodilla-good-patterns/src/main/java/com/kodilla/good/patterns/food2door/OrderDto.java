package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.challenges.Product;
import com.kodilla.good.patterns.challenges.User;
import com.kodilla.good.patterns.food2door.shops.Shop;

public class OrderDto {

    public Shop shop;
    public Product product;
    public boolean isOrdered;

    public OrderDto(final Shop shop, final Product product, final boolean isOrdered) {
        this.shop = shop;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Shop getShop() {
        return shop;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

}
