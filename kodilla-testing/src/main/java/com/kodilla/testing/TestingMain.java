package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calc = new Calculator();

        System.out.println("Test - add");
        if(calc.add(2,3) == 5) {
            System.out.println("Test OK");
        } else {
            System.out.println("Wrong result");
        }

        System.out.println("Test - subtract");
        if(calc.subtract(7,2) == 5) {
            System.out.println("Test OK");
        } else {
            System.out.println("Wrong result");
        }
    }
}