package com.example.library.factory;

import com.example.library.model.Book;

public class NonFictionBookFactory implements BookFactory {
    @Override
    public Book createBook() {
        return new Book.BookBuilder()
                .setTitle("Sapiens")
                .setAuthor("Yuval Noah Harari")
                .setPublicationYear(2011)
                .setGenre("Non-Fiction")
                .setPrice(20.99)
                .build();
    }
}