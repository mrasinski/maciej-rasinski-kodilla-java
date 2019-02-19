package com.kodilla.exception.test;

import com.kodilla.exception.test.SecondChallenge.MyException;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            String result = secondChallenge.probablyIWillThrowException(2, 1);
            System.out.println(result);

        } catch (MyException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("As expected");

        }
    }
}
