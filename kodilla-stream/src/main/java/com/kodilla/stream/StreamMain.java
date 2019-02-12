package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Java", (textToDecorate) -> textToDecorate.toUpperCase());
        poemBeautifier.beautify("Intellij", (textToDecorate) -> "ABC" + textToDecorate + "ABC");
        poemBeautifier.beautify("asfnnlasf", (textToDecorate) -> textToDecorate.substring(2));
        poemBeautifier.beautify("ASFOIjifjaASd", (textToDecorate) -> textToDecorate.toLowerCase());

    }
}
