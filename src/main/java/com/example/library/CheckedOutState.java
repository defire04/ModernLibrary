package com.example.library;


public class CheckedOutState implements BookState {
    @Override
    public void handleRequest() {
        System.out.println("The book is currently checked out.");
    }
}
