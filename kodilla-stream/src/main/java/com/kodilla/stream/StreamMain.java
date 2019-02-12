package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {

        /*
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Java", (textToDecorate) -> textToDecorate.toUpperCase());
        poemBeautifier.beautify("Intellij", (textToDecorate) -> "ABC" + textToDecorate + "ABC");
        poemBeautifier.beautify("asfnnlasf", (textToDecorate) -> textToDecorate.substring(2));
        poemBeautifier.beautify("ASFOIjifjaASd", (textToDecorate) -> textToDecorate.toLowerCase());
        */
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
