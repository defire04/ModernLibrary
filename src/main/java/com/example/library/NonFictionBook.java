package com.example.library;

import lombok.Setter;

@Setter
public class NonFictionBook implements Book {
    private String title;
    private double price;

    public NonFictionBook(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitNonFictionBook(this);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }
}