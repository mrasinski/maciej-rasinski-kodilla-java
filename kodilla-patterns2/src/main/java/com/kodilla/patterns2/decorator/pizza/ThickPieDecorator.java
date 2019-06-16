package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThickPieDecorator extends AbstractPizzaOrderDecorator {
    public ThickPieDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getPie() {
        return "Thick pie";
    }

    @Override
    public String getSauce() {
        return super.getSauce();
    }

    @Override
    public String getIngredient() {
        return super.getIngredient();
    }
}
