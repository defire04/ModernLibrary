package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

@Setter
public class ExternalLibraryBookAdapter implements Book {
    private ExternalLibraryBook externalLibraryBook;

    public ExternalLibraryBookAdapter(ExternalLibraryBook externalLibraryBook) {
        this.externalLibraryBook = externalLibraryBook;
    }

    @Override
    public String getTitle() {
        return externalLibraryBook.getBookTitle();
    }

    @Override
    public String getAuthor() {
        return externalLibraryBook.getBookAuthor();
    }

    @Override
    public String getDetails() {
        return externalLibraryBook.getBookInfo();
    }
}