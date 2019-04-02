package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);

        Double add = calculator.add(2,3);
        Double sub = calculator.sub(3,2);
        Double mul = calculator.mul(2,3);
        Double div = calculator.div(4,2);

        Assert.assertEquals(5.0, add, 0.0);
        Assert.assertEquals(1.0, sub, 0.0);
        Assert.assertEquals(6.0, mul, 0.0);
        Assert.assertEquals(2.0, div, 0.0);
    }
}
