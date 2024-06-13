package com.example.library.model;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
public class BookCollection implements BookComponent {
    private String collectionName;
    private List<BookComponent> books = new ArrayList<>();

    public BookCollection(String collectionName) {
        this.collectionName = collectionName;
    }

    @Override
    public String getTitle() {
        return collectionName;
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder(collectionName + " contains:\n");
        for (BookComponent book : books) {
            details.append("- ").append(book.getDetails()).append("\n");
        }
        return details.toString();
    }

    public void add(BookComponent bookComponent) {
        books.add(bookComponent);
    }

    public void remove(BookComponent bookComponent) {
        books.remove(bookComponent);
    }

    public BookComponent getChild(int index) {
        return books.get(index);
    }
}