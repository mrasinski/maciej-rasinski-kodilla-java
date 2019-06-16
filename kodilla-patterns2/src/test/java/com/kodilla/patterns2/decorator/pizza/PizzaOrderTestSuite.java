package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testMargheritaPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizzaOrder();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testMargheritaPizzaOrderGetPie() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizzaOrder();
        //When
        String pie = pizzaOrder.getPie();
        //Then
        assertEquals("Thin pie", pie);
    }

    @Test
    public void testMargheritaPizzaOrderGetSauce() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizzaOrder();
        //When
        String sauce = pizzaOrder.getSauce();
        //Then
        assertEquals("Tomato sauce", sauce);
    }

    @Test
    public void testMargheritaPizzaOrderGetIngredient() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizzaOrder();
        //When
        String ingredient = pizzaOrder.getIngredient();
        //Then
        assertEquals("Cheese", ingredient);
    }

    @Test
    public void testHawaiiPizzaOrderWithAddCheeseGetIngredient() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizzaOrder();
        pizzaOrder = new HawaiiPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        //When
        String ingredient = pizzaOrder.getIngredient();
        //Then
        assertEquals("Cheese + pineapple + ham + cheese", ingredient);
    }

    @Test
    public void testHawaiiPizzaOrderWithThickGetPie() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizzaOrder();
        pizzaOrder = new HawaiiPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ThickPieDecorator(pizzaOrder);
        //When
        String pie = pizzaOrder.getPie();
        //Then
        assertEquals("Thick pie", pie);
    }

    @Test
    public void testKebabPizzaOrderGetSauce() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizzaOrder();
        pizzaOrder = new KebabPizzaOrderDecorator(pizzaOrder);
        //When
        String sauce = pizzaOrder.getSauce();
        //Then
        assertEquals("Cream sauce", sauce);
    }

    @Test
    public void testPepperoniPizzaOrderWithAddChesseAndThickGetCost() {
        //Given
        PizzaOrder pizzaOrder = new MargheritaPizzaOrder();
        pizzaOrder = new PepperoniPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        pizzaOrder = new ThickPieDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(32), cost);
    }
}
