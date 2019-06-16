package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class KebabPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public KebabPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(13));
    }

    @Override
    public String getPie() {
        return super.getPie();
    }

    @Override
    public String getSauce() {
        return "Cream sauce";
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + chicken + onion";
    }
}
