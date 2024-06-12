package com.example.library.factory;

import com.example.library.model.FictionBook;

public class FictionBookFactory implements BookFactory {
    @Override
    public FictionBook createBook(String title, String author) {
        return new FictionBook(title, author);
    }
}