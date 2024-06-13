package com.example.library;

import com.example.library.model.Book;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book.BookBuilder()
                .setTitle("The Great Gatsby")
                .setAuthor("F. Scott Fitzgerald")
                .setPublicationYear(1925)
                .setGenre("Fiction")
                .setPrice(15.99)
                .setAvailable(true)
                .build();

        System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
    }
}
