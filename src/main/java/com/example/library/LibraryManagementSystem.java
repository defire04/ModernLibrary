package com.example.library;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction", 15.99));
        bookCollection.addBook(new Book("Clean Code", "Robert C. Martin", 2008, "Non-Fiction", 29.99));
        bookCollection.addBook(new Book("Design Patterns", "Erich Gamma et al.", 1994, "Non-Fiction", 39.99));

        Iterator<Book> iterator = bookCollection.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
