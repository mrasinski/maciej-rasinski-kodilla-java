package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            String result = secondChallenge.probablyIWillThrowException(2, 1);
            System.out.println(result);

        } catch (Exception e) {

            System.out.println("Exception was thown!");

        } finally {

            System.out.println("As expected");

        }
    }
}
