package com.example.library;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookProcessor fictionProcessor = new FictionBookProcessor();
        fictionProcessor.processBook();

        System.out.println();

        BookProcessor nonFictionProcessor = new NonFictionBookProcessor();
        nonFictionProcessor.processBook();
    }
}
