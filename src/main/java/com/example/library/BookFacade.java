package com.example.library;

public class BookFacade {
    private FictionBook fictionBook;
    private NonFictionBook nonFictionBook;

    public BookFacade(String fictionTitle, String fictionAuthor, String nonFictionTitle, String nonFictionAuthor) {
        this.fictionBook = new FictionBook(fictionTitle, fictionAuthor);
        this.nonFictionBook = new NonFictionBook(nonFictionTitle, nonFictionAuthor);
    }

    public String getFictionBookDetails() {
        return fictionBook.getDetails();
    }

    public String getNonFictionBookDetails() {
        return nonFictionBook.getDetails();
    }
}