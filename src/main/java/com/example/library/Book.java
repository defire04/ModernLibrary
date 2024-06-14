package com.example.library;

public interface Book {
    void accept(Visitor visitor);
    String getTitle();
    double getPrice();
}
