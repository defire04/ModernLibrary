package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.BookDecorator;

public class NonFictionBook extends BookDecorator {
    public NonFictionBook(Book book) {
        super(book);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Genre: Non-Fiction";
    }
}