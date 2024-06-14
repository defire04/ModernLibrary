package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.BookDecorator;

public class FictionBook extends BookDecorator {
    public FictionBook(Book book) {
        super(book);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Genre: Fiction";
    }
}