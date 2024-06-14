package com.example.library.model;

import com.example.library.service.BookService;

public class NonFictionBook extends Book {
    public NonFictionBook(BookService bookService) {
        super(bookService);
    }

    @Override
    public String open() {
        return bookService.openBook();
    }

    @Override
    public String close() {
        return bookService.closeBook();
    }
}