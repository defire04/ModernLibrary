package com.example.library;

import com.example.library.model.Book;
import com.example.library.model.BookCollection;
import com.example.library.model.BookComponent;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookComponent book1 = new Book("1984", "George Orwell");
        BookComponent book2 = new Book("Sapiens", "Yuval Noah Harari");

        BookCollection fictionCollection = new BookCollection("Fiction Collection");
        fictionCollection.add(book1);

        BookCollection nonFictionCollection = new BookCollection("Non-Fiction Collection");
        nonFictionCollection.add(book2);

        BookCollection library = new BookCollection("Library");
        library.add(fictionCollection);
        library.add(nonFictionCollection);

        System.out.println(library.getDetails());
    }
}
