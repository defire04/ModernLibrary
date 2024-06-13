package com.example.library;

import com.example.library.factory.BookFactory;
import com.example.library.factory.FictionBookFactory;
import com.example.library.factory.NonFictionBookFactory;
import com.example.library.model.Book;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book fictionBook = new Book.BookBuilder()
                .setTitle("1984")
                .setAuthor("George Orwell")
                .setPublicationYear(1949)
                .setGenre("Fiction")
                .setPrice(15.99)
                .build();

        System.out.println("Fiction Book: " + fictionBook.getTitle() + " by " + fictionBook.getAuthor());

        BookFactory fictionFactory = new FictionBookFactory();
        Book createdFictionBook = fictionFactory.createBook();
        System.out.println("Created Fiction Book: " + createdFictionBook.getTitle() + " by " + createdFictionBook.getAuthor());

        BookFactory nonFictionFactory = new NonFictionBookFactory();
        Book createdNonFictionBook = nonFictionFactory.createBook();
        System.out.println("Created Non-Fiction Book: " + createdNonFictionBook.getTitle() + " by " + createdNonFictionBook.getAuthor());
    }
}
