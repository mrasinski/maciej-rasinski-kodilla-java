package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.person.People;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Java", textToDecorate -> textToDecorate.toUpperCase());
        poemBeautifier.beautify("Intellij", textToDecorate -> "ABC" + textToDecorate + "ABC");
        poemBeautifier.beautify("asfnnlasf", textToDecorate -> textToDecorate.substring(2));
        poemBeautifier.beautify("ASFOIjifjaASd", textToDecorate -> textToDecorate.toLowerCase());

        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
    }
}
