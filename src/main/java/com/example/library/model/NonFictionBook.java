package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NonFictionBook extends Book {

    private final String genre = "NON - FICTION";

    public NonFictionBook(String title, String author) {
        super(title, author);
    }
}