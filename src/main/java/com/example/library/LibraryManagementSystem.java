package com.example.library;

import com.example.library.factory.BookFactory;
import com.example.library.factory.FictionBookFactory;
import com.example.library.factory.NonFictionBookFactory;
import com.example.library.model.Book;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookFactory fictionFactory = new FictionBookFactory();
        Book fictionBook = fictionFactory.createBook("1984", "George Orwell");

        BookFactory nonFictionFactory = new NonFictionBookFactory();
        Book nonFictionBook = nonFictionFactory.createBook("Sapiens", "Yuval Noah Harari");

        System.out.println("Fiction Book: " + fictionBook.getTitle() + " by " + fictionBook.getAuthor() + " [" + fictionBook.getGenre() + "]");
        System.out.println("Non-Fiction Book: " + nonFictionBook.getTitle() + " by " + nonFictionBook.getAuthor() + " [" + nonFictionBook.getGenre() + "]");
    }
}
