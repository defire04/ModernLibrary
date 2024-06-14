package com.example.library;


public class NonFictionBookProcessor extends BookProcessor {
    @Override
    protected void selectBook() {
        System.out.println("Selecting a non-fiction book...");
    }

    @Override
    protected void readBook() {
        System.out.println("Reading a non-fiction book...");
    }

    @Override
    protected void summarizeBook() {
        System.out.println("Summarizing the non-fiction book...");
    }
}
