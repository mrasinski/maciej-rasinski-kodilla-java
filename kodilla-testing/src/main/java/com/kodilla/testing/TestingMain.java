package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calc = new Calculator();

        if(calc.add(2,3) == 5) {
            System.out.println("Test OK");
        } else {
            System.out.println("Wrong result");
        }

        if(calc.substract(2,3) == 5) {
            System.out.println("Test OK");
        } else {
            System.out.println("Wrong result");
        }
    }
}