package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Clasifier;

import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Clasifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        return publicationYearMedian(bookSet);
    }
}
