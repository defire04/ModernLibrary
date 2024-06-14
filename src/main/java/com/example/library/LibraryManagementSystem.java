package com.example.library;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bookStore.registerObserver(customer1);
        bookStore.registerObserver(customer2);

        Book newBook = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        bookStore.setBook(newBook);
    }
}
