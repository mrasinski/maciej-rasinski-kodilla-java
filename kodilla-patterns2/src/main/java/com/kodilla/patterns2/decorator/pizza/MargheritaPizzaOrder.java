package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MargheritaPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getPie() {
        return "Thin pie";
    }

    @Override
    public String getSauce() {
        return "Tomato sauce";
    }

    @Override
    public String getIngredient() {
        return "Cheese";
    }
}
