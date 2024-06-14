package com.example.library;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99));
        collection.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 12.99));

        System.out.println("Initial collection:");
        collection.printBooks();

        BookCollectionMemento memento = collection.createMemento();

        collection.addBook(new Book("1984", "George Orwell", 10.99));
        System.out.println("\nAfter adding 1984:");
        collection.printBooks();

        collection.restoreMemento(memento);
        System.out.println("\nAfter restoring memento:");
        collection.printBooks();
    }
}
