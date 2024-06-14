package com.example.library;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookFacade bookFacade = new BookFacade("The Great Gatsby", "F. Scott Fitzgerald", "Clean Code", "Robert C. Martin");

        System.out.println("Fiction Book Details: " + bookFacade.getFictionBookDetails());
        System.out.println("Non-Fiction Book Details: " + bookFacade.getNonFictionBookDetails());
    }
}
