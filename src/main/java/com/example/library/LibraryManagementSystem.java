package com.example.library;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();

        Book book1 = bookFactory.getBook("Design Patterns", "Gang of Four");
        Book book2 = bookFactory.getBook("Clean Code", "Robert C. Martin");
        Book book3 = bookFactory.getBook("Design Patterns", "Gang of Four");


        System.out.println(book1.getDetails());
        System.out.println(book2.getDetails());
        System.out.println(book3.getDetails());
    }
}
