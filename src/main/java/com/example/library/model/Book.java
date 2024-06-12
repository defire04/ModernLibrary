package com.example.library.model;

import lombok.Data;

@Data
public abstract class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract String getGenre();
}