package com.example.library.model;

import com.example.library.service.BookService;

public abstract class Book {
    protected BookService bookService;

    public Book(BookService bookService) {
        this.bookService = bookService;
    }

    public abstract String open();
    public abstract String close();
}
