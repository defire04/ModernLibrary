package com.example.library;

public class FictionBookProcessor extends BookProcessor {
    @Override
    protected void selectBook() {
        System.out.println("Selecting a fiction book...");
    }

    @Override
    protected void readBook() {
        System.out.println("Reading a fiction book...");
    }

    @Override
    protected void summarizeBook() {
        System.out.println("Summarizing the fiction book...");
    }
}
