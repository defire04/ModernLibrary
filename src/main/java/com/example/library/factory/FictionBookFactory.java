package com.example.library.factory;

import com.example.library.model.Book;

public class FictionBookFactory implements BookFactory {
    @Override
    public Book createBook() {
        return new Book.BookBuilder()
                .setTitle("1984")
                .setAuthor("George Orwell")
                .setPublicationYear(1949)
                .setGenre("Fiction")
                .setPrice(15.99)
                .build();
    }
}