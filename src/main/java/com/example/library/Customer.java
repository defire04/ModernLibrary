package com.example.library;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer implements Observer {
    private String name;

    @Override
    public void update(Book book) {
        System.out.println("Hello " + name + ", the new book '" + book.getTitle() + "' by " + book.getAuthor() + " is now available!");
    }
}
