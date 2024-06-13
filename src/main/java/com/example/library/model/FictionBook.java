package com.example.library.model;

public class FictionBook extends Book {
    public FictionBook(String title, String author, int year, double price) {
        super(title, author, year, "Fiction", price);
    }
}