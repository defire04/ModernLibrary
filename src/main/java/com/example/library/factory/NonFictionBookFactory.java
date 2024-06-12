package com.example.library.factory;

import com.example.library.model.NonFictionBook;

public class NonFictionBookFactory implements BookFactory {
    @Override
    public NonFictionBook createBook(String title, String author) {
        return new NonFictionBook(title, author);
    }
}
