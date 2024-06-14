package com.example.library;

public class ReservedState implements BookState {
    @Override
    public void handleRequest() {
        System.out.println("The book is reserved.");
    }
}
