package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;
import java.util.stream.Collectors;


public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        List<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookList = new ArrayList<>(bookSet);
        List<com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> list = new ArrayList<>();
        for (int i = 0; i < bookSet.size(); i++) {
            list.add(new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(bookList.get(i).getAuthor(),
                    bookList.get(i).getTitle(), bookList.get(i).getYearOfPublish()));
        }
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books =
                list.stream().collect(Collectors.toMap(book -> new BookSignature(book.getTitle()), book -> book));
        return medianPublicationYear(books);
    }
}
