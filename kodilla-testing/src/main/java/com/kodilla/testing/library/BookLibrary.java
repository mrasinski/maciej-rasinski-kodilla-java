package com.kodilla.testing.library;

import java.util.*;

public class BookLibrary {

    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    boolean rentABook(LibraryUser libraryUser, Book book) {
        if(libraryDatabase.rentABook(libraryUser, book)) {
            return true;
        } else {
            return false;
        }
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> resultList = libraryDatabase
                .listBooksInHandsOf(libraryUser);
        return resultList;
    }
}
