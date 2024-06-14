package com.example.library;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private Map<String, Book> booksCache = new HashMap<>();

    public Book getBook(String title, String author) {
        String key = title + "_" + author;
        if (!booksCache.containsKey(key)) {
            booksCache.put(key, new ConcreteBook(title, author));
        }
        return booksCache.get(key);
    }
}