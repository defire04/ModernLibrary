package com.example.library;

import com.example.library.model.Book;
import com.example.library.model.ConcreteBook;
import com.example.library.model.ExternalLibraryBook;
import com.example.library.model.ExternalLibraryBookAdapter;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new ConcreteBook("1984", "George Orwell");
        System.out.println("ConcreteBook: " + book.getDetails());

        ExternalLibraryBook externalLibraryBook = new ExternalLibraryBook("Sapiens", "Yuval Noah Harari");
        Book adapterBook = new ExternalLibraryBookAdapter(externalLibraryBook);
        System.out.println("AdapterBook: " + adapterBook.getDetails());
    }
}
