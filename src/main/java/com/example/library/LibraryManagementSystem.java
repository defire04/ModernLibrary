package com.example.library;

import com.example.library.model.FictionBook;
import com.example.library.model.NonFictionBook;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook();
        fictionBook.setTitle("1984");
        fictionBook.setAuthor("George Orwell");
        fictionBook.setPublicationYear(1949);
        fictionBook.setGenre("Fiction");
        fictionBook.setPrice(15.99);

        FictionBook clonedFictionBook = fictionBook.clone();
        System.out.println("Original Fiction Book: " + fictionBook.getTitle() + " by " + fictionBook.getAuthor());
        System.out.println("Cloned Fiction Book: " + clonedFictionBook.getTitle() + " by " + clonedFictionBook.getAuthor());

        NonFictionBook nonFictionBook = new NonFictionBook();
        nonFictionBook.setTitle("Sapiens");
        nonFictionBook.setAuthor("Yuval Noah Harari");
        nonFictionBook.setPublicationYear(2011);
        nonFictionBook.setGenre("Non-Fiction");
        nonFictionBook.setPrice(20.99);

        NonFictionBook clonedNonFictionBook = nonFictionBook.clone();
        System.out.println("Original Non-Fiction Book: " + nonFictionBook.getTitle() + " by " + nonFictionBook.getAuthor());
        System.out.println("Cloned Non-Fiction Book: " + clonedNonFictionBook.getTitle() + " by " + clonedNonFictionBook.getAuthor());
    }
}
