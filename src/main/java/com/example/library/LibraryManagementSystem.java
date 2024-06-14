package com.example.library;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book fictionBook = new FictionBook("The Great Gatsby", 15.99);
        Book nonFictionBook = new NonFictionBook("Sapiens: A Brief History of Humankind", 12.99);

        Visitor currencyConverter = new CurrencyConverter();

        fictionBook.accept(currencyConverter);
        nonFictionBook.accept(currencyConverter);
    }
}
