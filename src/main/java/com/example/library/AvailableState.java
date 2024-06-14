package com.example.library;

import java.util.List;

public class AvailableState implements BookState {
    @Override
    public void handleRequest() {
        System.out.println("The book is available for checkout.");
    }
}