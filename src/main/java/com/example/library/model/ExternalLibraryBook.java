package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExternalLibraryBook {
    private String bookTitle;
    private String bookAuthor;

    public ExternalLibraryBook(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public String getBookInfo() {
        return bookTitle + " by " + bookAuthor;
    }
}