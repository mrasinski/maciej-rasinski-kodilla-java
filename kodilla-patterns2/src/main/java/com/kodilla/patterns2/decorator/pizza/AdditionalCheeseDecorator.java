package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalCheeseDecorator extends AbstractPizzaOrderDecorator{
    public AdditionalCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getPie() {
        return super.getPie();
    }

    @Override
    public String getSauce() {
        return super.getSauce();
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + cheese";
    }
}
