package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private double price;

    public Book(String title, String author, int year, String genre, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
        this.genre = genre;
        this.price = price;
    }
}