package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public PepperoniPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(12));
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
        return super.getIngredient() + " + pepperoni";
    }
}
