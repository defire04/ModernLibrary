package com.example.library.model;

public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, int year, double price) {
        super(title, author, year, "Non-Fiction", price);
    }
}
