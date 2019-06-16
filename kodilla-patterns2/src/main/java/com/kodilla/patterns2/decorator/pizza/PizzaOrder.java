package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    BigDecimal getCost();
    String getPie();
    String getSauce();
    String getIngredient();
}
