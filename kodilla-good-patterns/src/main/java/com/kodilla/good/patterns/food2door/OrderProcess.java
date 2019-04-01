package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.shops.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.shops.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.shops.HealthyShop;
import com.kodilla.good.patterns.food2door.shops.Shop;

public class OrderProcess {

    public static void main(String[] args) {

        Shop extraFoodShop = new ExtraFoodShop(new Product("Bread", 10));
        Shop glutenFreeShop = new GlutenFreeShop(new Product("Flour", 1));
        Shop healthyShop1 = new HealthyShop(new Product("Seeds", 23), 25);
        Shop healthyShop2 = new HealthyShop(new Product("Seeds", 3), 2);

        extraFoodShop.process();
        glutenFreeShop.process();
        healthyShop1.process();
        healthyShop2.process();

    }
}
