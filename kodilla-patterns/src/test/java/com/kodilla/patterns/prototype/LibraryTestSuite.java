package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.Stream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        Library library = new Library("Library of books1");
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Book" + n, "Author" + n, LocalDate.now())));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library of books2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library of books3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
