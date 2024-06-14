package com.example.library;

public class FictionBookHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public String handleRequest(Book book) {
        if (book.getGenre().equalsIgnoreCase("Fiction")) {
            return "Handling Fiction Book: " + book.getTitle();
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(book);
        } else {
            return "Book not handled";
        }
    }
}
