package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author1", "Title1", 1984, "8489646486");
        Book book2 = new Book("Author2", "Title2", 2000, "8489646486");
        Book book3 = new Book("Author3", "Title3", 1999, "8489646486");
        Book book4 = new Book("Author4", "Title4", 2004, "8489646486");
        Book book5 = new Book("Author5", "Title5", 2019, "8489646486");
        Book book6 = new Book("Author6", "Title6", 2008, "8489646486");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println(median);
        assertEquals(median, 2002, 0);
    }
}
