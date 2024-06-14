package com.example.library;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private BookState state;

    public Book() {
        this.state = new AvailableState();
    }

    public void handleRequest() {
        state.handleRequest();
    }
}