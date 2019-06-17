package com.kodilla.patterns2.adapter.bookclasifier.librarya;

public class Book {
    private final String author;
    private final String title;
    private final int yearOfPublish;
    private final String signature;

    public Book(final String author, final String title, final int yearOfPublish, final String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public String getSignature() {
        return signature;
    }
}
