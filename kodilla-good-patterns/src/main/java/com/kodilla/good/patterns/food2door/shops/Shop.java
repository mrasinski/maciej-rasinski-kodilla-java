package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.Product;

public class Shop {

    private String shopName;
    private Product product;

    public Shop(String shopName, Product product) {
        this.shopName = shopName;
        this.product = product;
    }

    public String getShopName() {
        return shopName;
    }

    public Product getProduct() {
        return product;
    }
}
