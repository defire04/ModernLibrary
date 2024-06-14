package com.example.library;


import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public BookCollectionMemento createMemento() {
        return new BookCollectionMemento(new ArrayList<>(books));
    }

    public void restoreMemento(BookCollectionMemento memento) {
        books = memento.books();
    }

    public void printBooks() {
        books.forEach(System.out::println);
    }
}