package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book implements BookComponent {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getDetails() {
        return title + " by " + author;
    }
}