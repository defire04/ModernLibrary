package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FictionBook extends Book {

    private final String genre = "FICTION";

    public FictionBook(String title, String author) {
        super(title, author);
    }
}