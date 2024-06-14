package com.example.library;

public interface Handler {
    void setNextHandler(Handler handler);
    String handleRequest(Book book);
}