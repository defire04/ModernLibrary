package com.example.library;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book();

        book.handleRequest();

        book.setState(new CheckedOutState());
        book.handleRequest();

        book.setState(new ReservedState());
        book.handleRequest();
    }
}
