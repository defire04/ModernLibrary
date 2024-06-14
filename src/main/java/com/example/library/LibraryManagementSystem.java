package com.example.library;

import com.example.library.model.Book;
import com.example.library.model.ConcreteBook;
import com.example.library.service.FictionBook;
import com.example.library.service.NonFictionBook;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book myBook = new ConcreteBook("Design Patterns", "Gang of Four");

        Book decoratedFictionBook = new FictionBook(myBook);
        Book decoratedNonFictionBook = new NonFictionBook(myBook);

        System.out.println("Original Book: " + myBook.getDetails());
        System.out.println("Fiction Book: " + decoratedFictionBook.getDetails());
        System.out.println("Non-Fiction Book: " + decoratedNonFictionBook.getDetails());
    }
}
