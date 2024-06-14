package com.example.library.service;

public class NonFictionBookService implements BookService {
    @Override
    public String openBook() {
        return "Opening Non-Fiction Book...";
    }

    @Override
    public String closeBook() {
        return "Closing Non-Fiction Book...";
    }
}