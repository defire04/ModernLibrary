package com.example.library.service;

public class FictionBookService implements BookService {
    @Override
    public String openBook() {
        return "Opening Fiction Book...";
    }

    @Override
    public String closeBook() {
        return "Closing Fiction Book...";
    }
}