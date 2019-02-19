package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws MyException {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new MyException();
        }
        return "Done!";
    }

    class MyException extends Exception {
        public MyException() {
            super("Exception was thown!");
        }
    }
}
