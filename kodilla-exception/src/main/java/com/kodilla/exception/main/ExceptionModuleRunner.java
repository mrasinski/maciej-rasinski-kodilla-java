package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {

    public static void main(String args[]) {

        FileReader fileReader2 = new FileReader();
        try {
            fileReader2.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem with reading file");
        }

    }
}
