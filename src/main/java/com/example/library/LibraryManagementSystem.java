package com.example.library;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Handler fictionHandler = new FictionBookHandler();
        Handler nonFictionHandler = new NonFictionBookHandler();

        fictionHandler.setNextHandler(nonFictionHandler);

        Book fictionBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction", 15.99);
        Book nonFictionBook = new Book("Clean Code", "Robert C. Martin", 2008, "Non-Fiction", 29.99);

        System.out.println(fictionHandler.handleRequest(fictionBook));
        System.out.println(fictionHandler.handleRequest(nonFictionBook));
    }
}
